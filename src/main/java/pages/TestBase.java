package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

	public static WebDriver driver;

	public static void init() {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	}
	public static void tearDown() {
		driver.close();
	}
	
//	ScreenShot Method
	public void takeScreenshot(WebDriver driver) {
		  
		  TakesScreenshot ts =  (TakesScreenshot)driver;
		  File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		  
		  SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		  Date date = new Date();
		   
		  String label = formatter.format(date);
		  
		  try {
		   FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir") + "/screenshots/" + label + ".png"));
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
		 }
//	Randomise Method

		public int generateRandomNumber(int boundNum) {
			Random rnd = new Random();
			int generatedNum = rnd.nextInt(boundNum);
			return generatedNum;

		}
//		Explicit Wait Method
		 
		  public void waitForElement(WebDriver driver,int waitTime,WebElement element) {
				WebDriverWait wait = new WebDriverWait(driver, waitTime);
				wait.until(ExpectedConditions.visibilityOf(element));
			}
			

		 
	}


