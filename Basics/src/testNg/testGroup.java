package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testGroup {
	WebDriver driver;

	@BeforeTest
	public void init() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Velocity\\Automation\\selenium\\selenium configuration\\Chrome_116.0.5845.97\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	}

	@Test(groups = "sanity")
	public void verifyTitle() {
		System.out.println("Verify Title Test Case");
		Assert.assertTrue(true);
	}

	@Test(groups = "sanity")
	public void verifyurl() {
		System.out.println("Verify URL Test Case");
		Assert.assertTrue(true);
	}

	@Test(groups = "integration-test")
	public void verifySignInButton() throws InterruptedException {
		boolean stateOfButton = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		System.out.println("verifySignInButton");
		Assert.assertTrue(stateOfButton);
	}

	@Test(groups = "integration-test")
	public void verifyCreateAccButton() {
		boolean stateOfCreateAccButton = driver.findElement(By.xpath("//a[text()='Create New Account']")).isEnabled();
		System.out.println("verifyCreateAccButton");
		Assert.assertTrue(stateOfCreateAccButton);
	}

	@AfterTest
	public void tearDown() {

		driver.close();
	}

}
