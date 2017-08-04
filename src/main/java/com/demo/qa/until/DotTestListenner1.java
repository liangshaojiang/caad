package com.demo.qa.until;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class DotTestListenner1 extends TestListenerAdapter {
	public void onTestFailure(ITestResult tr) {
		try {
			TestBase tb = (TestBase) tr.getInstance();
			WebDriver driver = tb.getDriver();
			ScreenShot screenShot = new ScreenShot(driver);
			screenShot.takeshot();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

}
