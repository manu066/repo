package Slenium_grid;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Dseleniumgrid { 
	
	@Test
	public void gridPractice() throws MalformedURLException
	{

		URL url = new URL("http://localhost:9999/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		RemoteWebDriver driver = new RemoteWebDriver(url, cap);
		driver.get("http://www.gmail.com");
		
	}


}
