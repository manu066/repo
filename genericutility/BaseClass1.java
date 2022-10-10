package com.cu.genericutility;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.Centurion_University_OR.LoginPage;
import com.Centurion_University_OR.SignupPage;
import com.Centurion_University_OR.SignupconfirmPage;
import com.Centurion_University_OR.WelcomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	public static WebDriver sdriver;
	public static WebDriver driver;

	boolean flag = false;

	// Creating object of JavaUtility Class
	public JavaUtility jLib = new JavaUtility();

	// Creating object of ExcelUtility Class
	public ExcelUtility eLib = new ExcelUtility();

	// Creating object of FileUtility Class
	public FileUtility1 fLib = new FileUtility1();

	// Creating object of WebDriverUtility Class
	public WebDriverUtility wLib = new WebDriverUtility();

	// Creating object of DataBaseUtility Class
	public DataBaseUtility dLib = new DataBaseUtility();

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("DataBase is Connected");
	}

	//@Parameters("browser")
	@BeforeClass
	public void connectDB() throws Throwable {

		// Launch the Browser
		String Browser = fLib.getPropertyKeyValue("browser");
		WebDriverManager.chromedriver().setup();
		if (Browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		wLib.waitForElementInDOM(driver);
		sdriver=driver;
	}

		@BeforeMethod
		public void beforeMethod() throws Throwable{
		String URL = fLib.getPropertyKeyValue("URL2");
		int ran = jLib.getRanDomNumber();
		driver.get(URL);
		WelcomePage wl = new WelcomePage(driver);
		wl.ClickSignuplink();

		/**
		 * Fetch all the required data from Excel Sheet
		 * 
		 */
		String NAME = eLib.getExcelData("Sign_up", 0, 1);
		String DOB = eLib.getExcelData("Sign_up", 1, 1);
		String EMAIL_ID = eLib.getExcelData("Sign_up", 2, 1) + ran + "@gmail.com";
		String MOB_NO = eLib.getExcelData("Sign_up", 3, 1);
		String CODE = eLib.getExcelData("Sign_up", 4, 1);
		SignupPage sign = new SignupPage(driver);

		sign.CreateNewUser(NAME, DOB, EMAIL_ID, MOB_NO, CODE);

		WebElement Cred = driver.findElement(By.xpath("//font[contains(.,YourUserID)]"));
		String s = Cred.getText();
		String expResult = "Your User ID is CUTM";
		if (s.contains(expResult)) {
			System.out.println("New User is Created");
			flag = true;

		}
		WebElement Cred1 = driver.findElement(By.xpath("//font[contains(.,YourUserID)]"));
		String s1 = Cred1.getText();
		String[] arr = s1.split(" ");
		String USER_ID = arr[4];
		String PASSWORD = arr[8];

		SignupconfirmPage SignCon = new SignupconfirmPage(driver);
		SignCon.ClickonSubmitbtn();

		String Lo_url = driver.getCurrentUrl();
		String expResult_Lo = "index.php";
		if (Lo_url.contains(expResult_Lo)) {
			System.out.println("Login page is displayed");
			flag = true;

		} else {
			System.out.println("Login page is not displayed");
		}
		LoginPage log = new LoginPage(driver);
		log.loginToAppli(USER_ID, PASSWORD);
		Reporter.log("BeforeMethod", true);
	}

	
	

	@AfterMethod
	public void afterMethod() {
		System.out.println("********Logout from application**********");
	}

	@AfterClass
	public void afterClass() {

		System.out.println("*********Close the Browser**********");
		driver.quit();
		
	}

	@AfterSuite
	public void closeDB() {
		System.out.println("*********Close the database**********");
	}

}
