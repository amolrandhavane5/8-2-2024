package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertionClass {

	WebDriver driver;

	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Velocity\\Automation\\selenium\\selenium configuration\\Chrome_116.0.5845.97\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(ops);

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
	}

	@Test
	public void verifyTitle() {
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");

	}

	@Test
	public void verifybutton() {
		boolean state = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		Assert.assertTrue(state);
		System.out.println("After Assert Statements");
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.close();
	}
}
