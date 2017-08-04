package com.demo.qa.until;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public WebDriver driver; 
	 public Login(WebDriver driver) {
		  this.driver = driver;
		  PageFactory.initElements(driver, this);
		 }
	public void login(String userName,String passWord,String URL) {
		  System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		  driver.manage().window().maximize();
		  driver.get(URL);
		  driver.findElement(By.id("UserName")).sendKeys(userName);
		  driver.findElement(By.id("Password")).sendKeys(passWord);
		  driver.findElement(By.className("login-button")).click();
	  }
	public WebDriver getDriver() {
		  return driver;
		 }
}
