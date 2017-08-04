package visscaa;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demo.page.viss;
import com.demo.qa.until.DBUtilsCSV;
import com.demo.qa.until.Login;

public class Systeminqury {
	public WebDriver driver;

	@BeforeClass
	public void beforeclass() {
		driver = new FirefoxDriver();
		Login login = new Login(driver);
		login.login("vcyk002", "vcyk002", "http://www.visscaa.com");// 登录测试环境：http://172.16.2.3:8002正式环境http://www.visscaa.com
	}

	@DataProvider(name = "Systeminqury")
	public static Object[][] words() throws IOException {
		return DBUtilsCSV.getTestData("DataPlat\\Systeminqury.csv");
	}

	@Test(priority = 0, dataProvider = "Systeminqury")
	public void resident(String []inqury) throws InterruptedException {
//		String []inqurysh={"新北市","上海市","关岳路181弄1号 101室"};
		driver.navigate().refresh();
		viss viss = new viss(driver);
		viss.residentinqury(inqury);
		
	}
}
