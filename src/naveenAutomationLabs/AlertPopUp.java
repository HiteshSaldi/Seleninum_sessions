package naveenAutomationLabs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//Swastik Computers//workspace_ee//TDD_Frame//drivers//chromedriver.exe");
		WebDriver cdriver = new ChromeDriver();
		cdriver.get("http://demo.guru99.com/test/delete_customer.php");
		
		cdriver.findElement(By.name("cusid")).sendKeys("123");
		cdriver.findElement(By.name("submit")).click();
		
		//Alert PopUp
		
		Alert alert = cdriver.switchTo().alert();
		alert.accept();
		if(alert.getText().equals("Customer Successfully Delete!"))
		{
		alert.accept();
		}

	}

}
