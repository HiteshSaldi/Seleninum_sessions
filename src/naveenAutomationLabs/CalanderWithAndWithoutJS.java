package naveenAutomationLabs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class CalanderWithAndWithoutJS {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Swastik Computers//workspace//Selenium_Practice//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.spicejet.com/"); // enter URL
		
		String date = "30-09-2018";
		
		WebElement element = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_txt_Fromdate']"));
		
		
		selectDateByJS(driver,element,date);

	}
	
	
	public static void selectDateByJS(WebDriver driver,WebElement element,String dateVal){
		
		JavascriptExecutor js = (JavascriptExecutor) (driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		//js.executeScript("arguments[0].click();",element);
	}

}

