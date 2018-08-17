package naveenAutomationLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Swastik Computers//workspace//Selenium_Practice//Drivers//chromedriver.exe");
		
		WebDriver cdriver = new ChromeDriver();
		cdriver.get("http:\\google.com");
		cdriver.quit();
		
		System.setProperty("webdriver.gecko.driver", "C://Users//Swastik Computers//workspace//Selenium_Practice//Drivers//geckodriver.exe");

		WebDriver fdriver = new FirefoxDriver();
		fdriver.get("https:\\google.com");
		fdriver.close();
		
	}

}
