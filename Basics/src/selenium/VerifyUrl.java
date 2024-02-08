package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyUrl {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Amol\\VCT\\Automation\\selenium\\selenium configuration\\Chrome_118.0.5993.71\\chromedriver-win64\\chromedriver.exe");

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		String ActualtUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://www.facebook.com/";

		if (ActualtUrl.equals(ExpectedUrl)) {
			System.out.println("Test case pass");
		} else {
			System.out.println("Test case fail");
		}
	}
}
