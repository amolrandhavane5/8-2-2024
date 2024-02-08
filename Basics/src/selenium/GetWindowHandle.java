package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation\\selenium\\selenium configuration\\Chroe_114.0.5735.16\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(ops);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		WebElement tab= driver.findElement(By.xpath("//img[@style='max-width: 30px;']"));
		
		String ParentTab=driver.getWindowHandle();
		tab.click();
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		//driver.switchTo().window(ParentTab);
		driver.close();
		

	}

}
