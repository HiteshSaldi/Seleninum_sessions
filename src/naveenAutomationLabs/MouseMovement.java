package naveenAutomationLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
        
		System.setProperty("webdriver.chrome.driver", "C://Users//Swastik Computers//workspace//Selenium_Practice//Drivers//chromedriver.exe");
		
		WebDriver cdriver = new ChromeDriver();
		cdriver.get("https://book.spicejet.com/");
		
		Actions action = new Actions(cdriver);
		action.moveToElement(cdriver.findElement(By.xpath("//a[@id='Login']"))).build().perform();;
		Thread.sleep(2000);
		cdriver.findElement(By.linkText("Travel Agent Login")).click();
	}

}
