package dataviss;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demo.page.dataplat;
import com.demo.qa.until.DBUtilsCSV;
import com.demo.qa.until.Login;

public class property {
	public WebDriver driver;

	@BeforeClass
	public void beforeclass() {
		driver = new FirefoxDriver();
		Login login = new Login(driver);
		login.login("cscyk", "cscyk123", "http://172.16.2.3:10003");// 登录测试环境：http://172.16.2.3:10003正式环境http://data.visscaa.com
	}

	@DataProvider(name = "newproperty")
	public static Object[][] words() throws IOException {
		return DBUtilsCSV.getTestData("DataPlat\\propertydata.csv");
	}

	@Test(priority = 0, dataProvider = "newproperty")
	public void resident(String[] property) throws InterruptedException {

		dataplat datapalt = new dataplat(driver);
		datapalt.newproperty(property);// 住宅新增物业类型
		driver.quit();
	}
}
