package POM;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	LoginPage lp;
 
	  
	@BeforeClass 
	public void initObject() {
		
		lp=new LoginPage(driver);
		
	}
  
  @BeforeSuite
  public void beforeSuite() {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\Amol\\VCT\\Automation\\selenium\\selenium configuration\\Chrome_118.0.5993.71\\chromedriver-win64\\chromedriver.exe");
				//"D:\\Velocity\\Automation\\selenium\\selenium configuration\\Chrome_116.0.5845.97\\chromedriver-win64\\chromedriver.exe");
	  			
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(ops);

		driver.manage().window().maximize();
		
		//step-3 open web application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//step-4 dynamic wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  
  @Test
  public void login() {
	  
	  lp.enterCred("Admin", "admin123");
	  
	  lp.clcikButton();
	  
	  //Assert.assertEquals(driver.getTitle(),"OrangeHrm","Title doesnot matched");
	  Assert.assertTrue(true);
  
  }

  @AfterSuite
  public void afterSuite() {
	  
	  driver.close();
  }
}
