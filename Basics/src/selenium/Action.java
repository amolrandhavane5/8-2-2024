package selenium;

		import org.openqa.selenium.By;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class Action {

			public static void main(String[] args) throws InterruptedException {
				
				
		System.setProperty("webdriver.chrome.driver", "D:\\\\Velocity\\\\Automation\\\\selenium\\\\selenium configuration\\\\Chroe_114.0.5735.16\\\\chromedriver.exe");
				
				
				//Step -1 Launch browser 
				WebDriver driver =new ChromeDriver();
				
				//step-2 max window
				driver.manage().window().maximize();
				
				JavascriptExecutor je=(JavascriptExecutor) driver;
				//je.executeScript("window.scrollBy(0,900)");
				Thread.sleep(2000);
				
				//step-3 open web application
				driver.get("https://vctcpune.com/selenium/practice.html");
				Thread.sleep(2000);
				
				WebElement dropDownButton=driver.findElement(By.xpath("//*[@id='dropdown-class-example']"));
			
				je.executeScript("arguments[0].scrollIntoView();", dropDownButton);
				Thread.sleep(2000);
				//step-4 handle dropdown using actions class
				dropDownButton.click();
				Thread.sleep(2000);
				
				Actions act=new Actions(driver);
				
				act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(2000);
				//act.sendKeys(Keys.ARROW_DOWN).perform();
				Thread.sleep(2000);
				//act.sendKeys(Keys.ARROW_DOWN).perform();
				//Thread.sleep(2000);
				act.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).build().perform();
				
				Thread.sleep(8000);
				driver.close();
			}

	}

