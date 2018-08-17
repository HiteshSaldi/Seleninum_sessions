package naveenAutomationLabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadOrBrowseBtn {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//Swastik Computers//workspace//Selenium_Practice//Drivers//chromedriver.exe");
		
		WebDriver cdriver = new ChromeDriver();
	
		cdriver.get("http://demo.guru99.com/test/upload/");
		//Type=file should be there otherwise it will not work.
		cdriver.findElement(By.name("uploadfile_0")).sendKeys("C://Users//Swastik Computers//workspace//Selenium_Practice//ExternalFiles//Blank.docx");
		cdriver.findElement(By.id("terms")).click();
		cdriver.findElement(By.id("submitbutton")).click();
		
	}
}
