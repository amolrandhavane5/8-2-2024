package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class iframe_CalenderSamePageDate {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation\\selenium\\selenium configuration\\Chroe_114.0.5735.16\\chromedriver.exe");

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		Thread.sleep(2000);
		

		WebElement frame=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		Thread.sleep(5000);
		
		driver.switchTo().frame(frame);
		Thread.sleep(2000);
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		
		WebElement tryit=driver.findElement(By.xpath("(//button[text()='Try it']"));
		tryit.click();
	}
}

