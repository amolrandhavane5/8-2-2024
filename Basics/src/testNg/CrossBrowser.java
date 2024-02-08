package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver;

	@Parameters("browser")
	@BeforeTest
	public void init(String browserName) throws Exception {

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Velocity\\Automation\\selenium\\selenium configuration\\Chrome_116.0.5845.97\\chromedriver-win64\\chromedriver.exe");

			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");

			driver = new ChromeDriver(ops);

			driver.manage().window().maximize();

			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
		} else {
			if (browserName.equals("edge")) {

				System.setProperty("webdriver.edge.driver",
						"D:\\Velocity\\Automation\\selenium\\selenium configuration\\edge\\Version 116.0.1938.62\\msedgedriver.exe");

				EdgeOptions ops = new EdgeOptions();

				ops.addArguments("--remote-allow-origins=*");

				driver = new EdgeDriver(ops);

				driver.manage().window().maximize();

				driver.get("https://www.facebook.com/");
				Thread.sleep(2000);
			}
		}
	}

	@Test
	public void login() throws Exception {
		driver.findElement(By.id("email")).sendKeys("amol7748@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.id("pass")).sendKeys("12345678");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		Thread.sleep(2000);
	}

	@Test
	public void verifyTitle() throws Exception {
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);

		Assert.assertEquals(ActTitle, "Facebook");
		Thread.sleep(2000);
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
