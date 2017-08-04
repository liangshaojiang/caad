package com.demo.qa.until;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	public WebDriver driver;

	public ScreenShot(WebDriver driver) {
		this.driver = driver;
	}

	private void takeScreenshot(String screenPath) {
		try {
			File scrFile = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(screenPath));
		} catch (Exception e) {
			System.out.println("Screen shot error:" + screenPath);
		}
	}

	public void takeshot() {
		Date date = new Date();
		SimpleDateFormat sdFormat = new SimpleDateFormat("hh-mm-ss");
		String screenName = String.valueOf(sdFormat.format(date)) + ".jpg";
		File dir = new File("test-output/snapshot");
		if (!dir.exists())
			dir.mkdirs();
		String ScreenPath = dir.getAbsolutePath() + "/" + screenName;
		takeScreenshot(ScreenPath);
	}
}
