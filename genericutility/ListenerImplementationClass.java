package com.cu.genericutility;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementationClass implements ITestListener {

	public void onTestFailure(ITestResult result) {
		JavaUtility jLib = new JavaUtility();
		int ran = jLib.getRanDomNumber();
		String testName = result.getMethod().getMethodName();
		System.out.println(testName + "========Executing========");
		EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass1.driver);
		File src = edriver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(".\\screenshot\\" + testName + ran + ".PNG"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
