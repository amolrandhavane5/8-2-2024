package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class get_NO_Of_Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\\\Amol\\\\VCT\\\\Automation\\\\selenium\\\\selenium configuration\\\\Chrome_118.0.5993.71\\\\chromedriver-win64\\\\chromedriver.exe");

		EdgeOptions ops = new EdgeOptions();

		ops.addArguments("--remote-allow-origins=*");

		WebDriver driver = new EdgeDriver(ops);

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.getCurrentUrl();

		List<WebElement> links = driver.findElements(By.tagName("a"));

		int no = links.size();
		System.out.println("No of links are = " + no);

	}

}
