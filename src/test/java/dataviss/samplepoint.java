package dataviss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demo.page.Sample;
import com.demo.qa.until.Login;

public class samplepoint {
	public WebDriver driver; 
	@BeforeClass
	public void beforeclass(){
		driver=new FirefoxDriver();
	  	Login login =new Login(driver);
	  	login.login("cscyk", "cscyk123","http://172.16.2.3:10003");//登录测试环境：http://172.16.2.3:10003正式环境http://data.visscaa.com
	}
  @Test
  public void residentsample() throws InterruptedException  {
	  
	  Sample sample=new Sample(driver);
	  sample.residentsamplepoint("梅花园");


  }
  @Test
  public void officesample() throws InterruptedException  {
	  
	  Sample sample=new Sample(driver);
	  sample.officesamplepoint("长安花苑");
	  driver.navigate().refresh();

  }

}
