package naveenAutomationLabs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobtnCheckbox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//Swastik Computers//workspace//Selenium_Practice//Drivers//chromedriver.exe");
		
		WebDriver cdriver = new ChromeDriver();
		cdriver.get("http://newtours.demoaut.com/mercurysignon.php");
		cdriver.findElement(By.name("userName")).sendKeys("mercury");
		cdriver.findElement(By.name("password")).sendKeys("mercury");
		cdriver.findElement(By.name("login")).click();
		
		//Radio Button.
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
		

	}

}
