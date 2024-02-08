package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNg.TestNgListeners.class)
public class Lstnr {

	public static WebDriver driver;

	@BeforeTest
	public void init() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Velocity\\Automation\\selenium\\selenium configuration\\Chrome_116.0.5845.97\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(ops);

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	}

	@Test
	public void verifyTitle() {
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign u");
	}

	@Test
	public void verifyUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.co/");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
