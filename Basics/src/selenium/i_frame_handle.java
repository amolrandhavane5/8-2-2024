package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class i_frame_handle {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation\\selenium\\selenium configuration\\Chroe_114.0.5735.16\\chromedriver.exe");

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		Thread.sleep(2000);
		
		WebElement frame= driver.findElement(By.xpath("//iframe[@title='W3Schools HTML Tutorial']"));
		driver.switchTo().frame(frame);
		
		//driver.findElement(By.xpath("//input[@class='form-field-input live-search-form-field']")).click();
	}
}


