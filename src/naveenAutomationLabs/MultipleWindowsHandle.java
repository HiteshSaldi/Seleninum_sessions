package naveenAutomationLabs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Swastik Computers//workspace//Selenium_Practice//Drivers//chromedriver.exe");
		
		WebDriver cdriver = new ChromeDriver();
		cdriver.get("http://demo.guru99.com/popup.php");
		
		cdriver.findElement(By.linkText("Click Here")).click();
		
		String mainwindowhandle = cdriver.getWindowHandle();
		
		Set<String> allwindowshandle = cdriver.getWindowHandles();
		
		Iterator<String> it1 = allwindowshandle.iterator();
		
		while(it1.hasNext()){
			
			String childwindow = it1.next();
			if(!mainwindowhandle.equalsIgnoreCase(childwindow)){
				
				cdriver.switchTo().window(childwindow);
				cdriver.findElement(By.name("emailid")).sendKeys("gaurav.2n@gmail.com");
				cdriver.findElement(By.name("btnLogin")).click();
				Thread.sleep(2000);
				cdriver.close();
				break;
				
			}
			
		}
		cdriver.switchTo().window(mainwindowhandle);
		
		

	}

}
