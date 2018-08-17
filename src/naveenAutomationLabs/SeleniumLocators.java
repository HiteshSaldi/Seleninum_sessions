package naveenAutomationLabs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumLocators {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C://Users//Swastik Computers//workspace//Selenium_Practice//Drivers//chromedriver.exe");
		
		WebDriver cdriver = new ChromeDriver();
		cdriver.get("http://newtours.demoaut.com/mercurysignon.php");
		
		//1. By.name("");
		cdriver.findElement(By.name("userName")).sendKeys("mercury");
		cdriver.findElement(By.name("password")).sendKeys("mercury");
		cdriver.findElement(By.name("login")).click();
		
		int i=0;
		List <WebElement> lwb = cdriver.findElements(By.name("tripType"));
		while(i!=(lwb.size()))
		{
		if(lwb.get(i).getAttribute("value").equals("oneway"))
		{
			System.out.println("Hello");
			lwb.get(i).click();
			break;
		}
		i++;
		}
		
		//2. By.xpath("")
		Select selectPassenger = new Select(cdriver.findElement(By.xpath("//select[@name='passCount']")));
		selectPassenger.selectByVisibleText("2");
		
		//cdriver.quit();

	}

}
