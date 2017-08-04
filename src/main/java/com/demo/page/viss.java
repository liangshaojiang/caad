package com.demo.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class viss {
	@FindBy(xpath = "/html/body/div[1]/div[1]/div/div[1]/div/div[2]/s")
	private WebElement choiseproperty;// 物业类型
	@FindBy(xpath = "//span[text()='住宅']")
	private WebElement resident;// 住宅
	@FindBy(xpath = "//span[@id='defaultArea']")
	private WebElement defaultArea;// 默认城市
	@FindBy(css = "#btnGroupArea > i")
	private WebElement choiseArea;// 选择城市
	@FindBy(id = "TopAreaSwarch")
	private WebElement TopAreaSwarch;// 查找城市
	@FindBy(id = "topSearch")
	private WebElement topSearch;// 物业地址
	@FindBy(xpath = "//*[@id='form']/table/tbody/tr[4]/td[2]/p/input")
	private WebElement area;// 建筑面积
	@FindBy(xpath = "//input[@ name='CompletionYear']")
	private WebElement compleyear;// 竣工年份
	@FindBy(xpath = "//*[@id='iframeBody']")
	private WebElement iframe;// 跳转框架
	
	@FindBy(id = "btnpg")
	private WebElement evaluate;// 价格评估按钮
	@FindBy(id = "rs-UnitPrice")
	private WebElement unitprice;// 单价
	@FindBy(id = "rs-TotalPrice")
	private WebElement totalprice;// 总价

	public WebDriver driver;

	public viss(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// 等待元素10秒后，找不到抛出异常
		PageFactory.initElements(driver, this);

	}

	public void residentinqury(String []inqury) throws InterruptedException {// 操作页面

		Actions action = new Actions(driver);
		Thread.sleep(2000);
//		choiseproperty.click();
//		Thread.sleep(2000);
//		resident.click();
		Assert.assertEquals(defaultArea.getText(), inqury[0]);
		choiseArea.click();
		TopAreaSwarch.sendKeys(inqury[1]);
		action.sendKeys(Keys.ENTER).perform();;
		Thread.sleep(2000);
		topSearch.sendKeys(inqury[2]);
		action.sendKeys(Keys.ENTER).perform();;
		Thread.sleep(2000);
		driver.switchTo().frame(iframe);
//		area.clear();
//		area.sendKeys(inqury[3]);
//		compleyear.clear();
//		compleyear.sendKeys(inqury[4]);
		
		evaluate.click();
		Thread.sleep(20000);
		System.out.print(inqury[2]+"\t"+"单价："+unitprice.getText());
		System.out.print("\t"+"总价："+totalprice.getText());
		
		

	}

	public WebDriver getDriver() {
		return driver;
	}

}
