package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public void captureScreen(WebDriver driver, String name) throws InterruptedException, IOException {

		// System.setProperty("webdriver.chrome.driver",
		// "D:\\Velocity\\Automation\\selenium\\selenium
		// configuration\\Chrome_116.0.5845.97\\chromedriver-win64\\chromedriver.exe");
		// ChromeOptions ops = new ChromeOptions();
		// ops.addArguments("--remote-allow-origins=*");

		// WebDriver driver = new ChromeDriver(ops);

		// driver.manage().window().maximize();
		// Thread.sleep(2000);

		// driver.get("https://www.amazon.in/ref=nav_logo");
		// Thread.sleep(2000);

		TakesScreenshot tss = (TakesScreenshot) driver;
		File source = tss.getScreenshotAs(OutputType.FILE);

		// File dest = new File("D:\\Velocity\\Automation\\selenium\\selenium
		// part-1\\New folder\\"+name+".jpg");
		File dest = new File(System.getProperty("user.dir") + "\\ScreenShot\\" + name + ".jpg");

		FileHandler.copy(source, dest);
	}
}

// public static void main(String[] args) throws InterruptedException,
// IOException{

// ScreenShot sc= new ScreenShot();
// sc.captureScreen("Lstnr");
// }

//}
