package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import ExceptionHandeling.Ex1;

public class ReadData {

	public static String readData(int row, int col) throws IOException {

		String path = "D:\\Velocity\\Automation\\selenium\\Read data\\Book1.xlsx";

		File file = new File(path);

		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheetAt(row);

		String s = sheet.getRow(row).getCell(col).getStringCellValue();
		return s;
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println(readData(0, 0));
		System.out.println(readData(0, 1));

		Ex1 ref = new Ex1();

		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation\\selenium\\selenium configuration\\Chroe_114.0.5735.16\\chromedriver.exe");

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(readData(0, 0));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(readData(0, 1));

	}

}
