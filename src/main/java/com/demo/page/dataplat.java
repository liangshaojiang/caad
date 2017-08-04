package com.demo.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dataplat {
	@FindBy(xpath = ".//*[@id='wnav_30_span']")
	private WebElement parameter;// 估价参数管理
	@FindBy(xpath = ".//*[@id='wnav_31_span']")
	private WebElement property;// 物业分类设置
	@FindBy(xpath = "//*[@id='tabs']/div[2]/div[2]/div/iframe")
	private WebElement ifame;// 跳转框架
	@FindBy(xpath = "//span[text()='公寓']")
	private WebElement resident;// 公寓
	@FindBy(xpath = "//span[text()='纯办公']")
	private WebElement office;// 办公
	@FindBy(xpath = ".//*[@id='ztreeArea_1_switch']")
	private WebElement province;// 省+
	@FindBy(xpath = ".//*[@id='ztreeArea_2_switch']")
	private WebElement city;// 市+
	@FindBy(xpath = ".//*[@id='ztreeArea_4_span']")
	private WebElement county;// 区+
	@FindBy(xpath = "//*[@id='ztreeArea_4_a']")
	private WebElement countyname;// 区名称
	@FindBy(xpath = "//*[@id='tt']/div[2]/div[1]/div/div[1]/a[1]/span/span[1]")
	private WebElement newproperty;// 新增
	@FindBy(xpath = "//*[@id='tabList']/tbody/tr[1]/td[2]/div/span/input[1]")
	private WebElement propertname;// 物业细分名称
	@FindBy(xpath = "//*[@id='tabList']/tbody/tr[2]/td[1]/div/span/input[1]")
	private WebElement reportname;// 对应报告名称
	@FindBy(xpath = "//*[@id='tabList']/tbody/tr[2]/td[2]/div/span/span/a")
	private WebElement buidtype;// 建筑类别
	@FindBy(xpath = "//*[@id='_easyui_combobox_i1_0']")
	private WebElement buidtypevalue;
	@FindBy(xpath = "//*[@id='tabList']/tbody/tr[2]/td[3]/div/span/span/a")
	private WebElement unit;// 计价单位
	@FindBy(xpath = "//*[@id='_easyui_combobox_i2_1']")
	private WebElement unitvalue;
	@FindBy(xpath = "//*[@id='tabList']/tbody/tr[3]/td[1]/div/span/span/a")
	private WebElement underprice;// 含地下价格
	@FindBy(xpath = "//*[@id='_easyui_combobox_i3_0']")
	private WebElement underpricevalue;
	@FindBy(xpath = "//*[@id='tabList']/tbody/tr[3]/td[2]/div/span/span/a")
	private WebElement Decoration;// 装修标准
	@FindBy(xpath = "//*[@id='_easyui_combobox_i4_0']")
	private WebElement Decorationvalue;
	@FindBy(xpath = "//*[@id='tabList']/tbody/tr[3]/td[3]/div/span/span/a")
	private WebElement Independentprice;// 是否独立计价
	@FindBy(xpath = "//*[@id='_easyui_combobox_i5_0']")
	private WebElement Independentpricevalue;
	@FindBy(xpath = "//*[@id='tabList']/tbody/tr[4]/td[2]/div/span/input[1]")
	private WebElement ratio;// 计价比例
	@FindBy(xpath = "//*[@id='tabList']/tbody/tr[4]/td[3]/div/span/span/a")
	private WebElement Param;// 是否需要修正参数
	@FindBy(xpath = "//*[@id='_easyui_combobox_i7_0']")
	private WebElement Paramvalue;
	@FindBy(xpath = "//*[@id='tabList']/tbody/tr[5]/td[1]/div/span/input[1]")
	private WebElement basefloor;// 基准楼层
	@FindBy(xpath = "//*[@id='tabList']/tbody/tr[5]/td[2]/div/span/input[1]")
	private WebElement basearea;// 基准面积
	@FindBy(xpath = "//*[@id='tabList']/tbody/tr[5]/td[3]/div/span/span/a")
	private WebElement baseTowards;// 基准朝向
	@FindBy(xpath = "//*[@id='_easyui_combobox_i8_0']")
	private WebElement baseTowardsvalue;
	@FindBy(xpath = "//*[@id='tabList']/tbody/tr[6]/td[1]/div/span/span/a")
	private WebElement basesight;// 基准景观
	@FindBy(xpath = "//*[@id='_easyui_combobox_i9_0']")
	private WebElement basesightvalue;
	@FindBy(xpath = "//*[@id='tabList']/tbody/tr[6]/td[2]/div/span/input[1]")
	private WebElement baseyear;// 基准年份
	@FindBy(xpath = ".//*[@id='tabList']/tbody/tr[8]/td[1]/div/span/span/a")
	private WebElement mastertowards;// 主朝向
	@FindBy(xpath = "//*[@id='_easyui_combobox_i14_1']")
	private WebElement mastertowardsvalue;
	@FindBy(xpath = "//*[@id='updateSubmitClose']/span/span[1]")
	private WebElement saveandclose;// 保存并关闭
	@FindBy(xpath = "//div[text()='自动化物业类型测试']")
	private WebElement findgoal;// 选中添加的内容
	@FindBy(xpath = "//*[@id='tt']/div[2]/div[1]/div/div[1]/a[3]/span/span[1]")
	private WebElement goaldele;// 删除数据
	@FindBy(xpath = "/html/body/div[4]/div[2]/div[4]/a[1]")
	private WebElement confirmdele;// 确认删除

	public WebDriver driver;

	public dataplat(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// 等待元素5秒后，找不到抛出异常
		PageFactory.initElements(driver, this);
	}

	public void newproperty(String[] propertyvalue) {// 操作页面

		parameter.click();
		property.click();
		driver.switchTo().frame(ifame);
		resident.click();
		province.click();
		city.click();
		county.click();
		countyname.click();
		newproperty.click();
		propertname.sendKeys(propertyvalue[0]);
		reportname.sendKeys(propertyvalue[1]);
		buidtype.click();
		buidtypevalue.click();
		unit.click();
		unitvalue.click();
		underprice.click();
		underpricevalue.click();
		Decoration.click();
		Decorationvalue.click();
		Independentprice.click();
		Independentpricevalue.click();
		ratio.sendKeys(propertyvalue[2]);
		Param.click();
		Paramvalue.click();
		basefloor.sendKeys(propertyvalue[3]);
		basearea.sendKeys(propertyvalue[4]);
		baseTowards.click();
		baseTowardsvalue.click();
		basesight.click();
		basesightvalue.click();
		baseyear.sendKeys(propertyvalue[5]);
		mastertowards.click();
		mastertowardsvalue.click();
		saveandclose.click();
		// 选中添加的内容
		findgoal.click();
		System.out.println("新增物业类型信息:" + findgoal.getText());
		// 环境销毁
		goaldele.click();
		confirmdele.click();
		System.out.println("删除成功！");

	}

	public void newofficeproperty(String[] propertyvalue) {// 操作页面

		parameter.click();
		property.click();
		driver.switchTo().frame(ifame);
		office.click();
		province.click();
		city.click();
		county.click();
		countyname.click();
		newproperty.click();
		propertname.sendKeys(propertyvalue[0]);
		reportname.sendKeys(propertyvalue[1]);
		buidtype.click();
		buidtypevalue.click();
		unit.click();
		unitvalue.click();
		underprice.click();
		underpricevalue.click();
		Decoration.click();
		Decorationvalue.click();
		Independentprice.click();
		Independentpricevalue.click();
		ratio.sendKeys(propertyvalue[2]);
		Param.click();
		Paramvalue.click();
		basefloor.sendKeys(propertyvalue[3]);
		basearea.sendKeys(propertyvalue[4]);
		baseTowards.click();
		baseTowardsvalue.click();
		basesight.click();
		basesightvalue.click();
		baseyear.sendKeys(propertyvalue[5]);
		mastertowards.click();
		mastertowardsvalue.click();
		saveandclose.click();
		// 选中添加的内容
		findgoal.click();
		System.out.println("新增物业类型信息:" + findgoal.getText());
		// 环境销毁
		goaldele.click();
		confirmdele.click();
		System.out.println("删除成功！");

	}

	public WebDriver getDriver() {
		return driver;
	}

}
