package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyWindowTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation\\selenium\\selenium configuration\\Chroe_114.0.5735.16\\chromedriver.exe");

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		String actualTitle = driver.getTitle();
		System.out.println(driver.getTitle());
		String expectedTitle = "Facebook – log in or sign up";

		if (actualTitle.equals(expectedTitle)) {

			System.out.println("Test case Pass");

		} else {
			System.out.println("Test case Failed");
		}

	}

}
