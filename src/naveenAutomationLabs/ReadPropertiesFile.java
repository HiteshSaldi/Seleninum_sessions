package naveenAutomationLabs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream fs = new FileInputStream("C://Users//Swastik Computers//workspace//Selenium_Practice//ExternalFiles//Config.properties"); 
		
		prop.load(fs);
		
        System.setProperty("webdriver.chrome.driver", prop.getProperty("Chrome_Path"));
		
		WebDriver cdriver = new ChromeDriver();
		cdriver.get(prop.getProperty("URL"));
		
		cdriver.findElement(By.xpath(prop.getProperty("username_xpath"))).sendKeys(prop.getProperty("Password"));
		cdriver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("Username"));
        cdriver.findElement(By.xpath(prop.getProperty("login_xpath"))).click();
	}

}
