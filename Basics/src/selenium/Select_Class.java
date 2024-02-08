package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Select_Class {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation\\selenium\\selenium configuration\\Chroe_114.0.5735.16\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement button= driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		button.click();
		Thread.sleep(2000);
		
		WebElement Day= driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select se=new Select(Day);
		se.selectByValue("11");
		Thread.sleep(2000);
		
		WebElement Month= driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select se1=new Select(Month);
		se1.selectByVisibleText("Nov");
		Thread.sleep(2000);
		
		WebElement Year= driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select se2=new Select(Year);
		se2.selectByValue("2023");
		
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\Velocity\\Automation\\selenium\\ScreenShot\\img123.jpg");
		FileHandler.copy(source, dest);
	}

}
