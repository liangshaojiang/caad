package com.demo.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample {
	@FindBy(xpath="//*[@id='wnav_32_span']")
	private WebElement samplepointmanage;//样本点管理
	@FindBy(xpath="//*[@id='wnav_33_span']")
	private WebElement residentsamplepoint;//住宅小区样本点
	@FindBy(xpath="//*[@id='wnav_34_span']")
	private WebElement officesamplepoint;//办公小区样本点
	@FindBy(xpath="//*[@id='tabs']/div[2]/div[2]/div/iframe")
	private WebElement iframe;//框架
	@FindBy(xpath="//*[@id='ztreeAreaType_1_switch']")
	private WebElement province;//省
	@FindBy(xpath="//*[@id='ztreeAreaType_2_switch']")
	private WebElement city;//市
	@FindBy(xpath="//*[@id='ztreeAreaType_4_switch']")
	private WebElement county;//区
	@FindBy(xpath="//span[text()='江宁区']")
	private WebElement residentmodule;//板块
	@FindBy(xpath="//span[text()='办公板块名称']")
	private WebElement officemodule;//板块
	@FindBy(xpath="//span[text()='公寓']")
	private WebElement resident;//物业类型
	@FindBy(xpath="//span[text()='纯办公']")
	private WebElement office;//物业类型
	@FindBy(xpath="//*[@id='dvSearch']/a[1]")
	private WebElement selectsample;//选取样本点按钮
	@FindBy(xpath="//*[@id='AddSearchForm']/table/tbody/tr/td[2]/div/span/input[1]")
	private WebElement residentproject;//小区名址	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/form/table/tbody/tr[1]/td[2]/span/input[1]")
	private WebElement officeproject;//小区名址
	@FindBy(xpath="//span[text()='搜索']")
	private WebElement search;//搜索
	@FindBy(xpath="//div[text()='梅花园']")
	private WebElement selectproject;//选择小区
	@FindBy(xpath="//div[text()='长安花苑']")
	private WebElement selectoffice;//选择小区
	@FindBy(xpath="//span[text()='设置样本点']")
	private WebElement settingsample;//设置样本点按钮
	@FindBy(xpath="//span[text()='确定']")
	private WebElement confirm;//confirm确定按钮
	@FindBy(xpath="//span[text()='确定']")
	private WebElement alert;//alert确定按钮
	@FindBy(xpath="/html/body/div[3]/div[1]/div[2]/a")
	private WebElement close;//关闭窗口
	@FindBy(xpath="//*[@id='tabSearch']/tbody/tr/td[2]/div/span/input[1]")
	private WebElement inputproject;//输入小区名址
	@FindBy(xpath=".//*[@id='tabSearch']/tbody/tr/td[2]/span/input[2]")
	private WebElement inputofficeproject;//输入小区名址
	@FindBy(xpath="//*[@id='dvSearch']/a[2]/span/span[1]")
	private WebElement find;//查询按钮
	@FindBy(xpath="//div[text()='梅花园']")
	private WebElement checksample;//勾选样本点
	@FindBy(xpath="//div[text()='长安花苑']")
	private WebElement checkofficesample;//勾选样本点
	@FindBy(xpath="//span[text()='删除']")
	private WebElement deletbutton;//删除按钮
	@FindBy(xpath="//span[text()='确定']")
	private WebElement confirmdele;//确定按钮
	
	
	
public WebDriver driver;
public Sample(WebDriver driver) { 
	this.driver = driver; 
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//等待元素10秒后，找不到抛出异常
	PageFactory.initElements(driver, this);
 }
public  void residentsamplepoint(String projectname) throws InterruptedException{//操作页面
	samplepointmanage.click();
	residentsamplepoint.click();
	driver.switchTo().frame(iframe);
	province.click();
	city.click();
	county.click();
	residentmodule.click();
	resident.click();
 	selectsample.click();
	residentproject.sendKeys(projectname);
	search.click();
	Thread.sleep(3000);
	selectproject.click();
	settingsample.click();
	Thread.sleep(3000);
	confirm.click();
	Thread.sleep(3000);
	alert.click();
	Thread.sleep(3000);
	close.click();
	inputproject.sendKeys(projectname);
	Thread.sleep(3000);
	find.click();
	checksample.click();
	System.out.println(checksample.getText());
	deletbutton.click();
	confirmdele.click();
	System.out.println("删除成功！");
	
}
public  void officesamplepoint(String projectname) throws InterruptedException{//操作页面

	samplepointmanage.click();
	officesamplepoint.click();
	driver.switchTo().frame(iframe);
	province.click();
	city.click();
	county.click();
	officemodule.click();
	office.click();
	selectsample.click();
	officeproject.sendKeys(projectname);
	search.click();
	Thread.sleep(3000);
	selectoffice.click();
	settingsample.click();
	Thread.sleep(3000);
	confirm.click();
 	Thread.sleep(3000);
	alert.click();
	Thread.sleep(3000);
	close.click();
//	inputofficeproject.sendKeys(projectname);
	find.click();
	Thread.sleep(3000);
	checkofficesample.click();
	System.out.println(checkofficesample.getText());
	deletbutton.click();
	confirmdele.click();
	System.out.println("删除成功！");
	
	
}
public WebDriver getDriver() {
	  return driver;
	 }
}