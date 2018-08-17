
package TestNG_FrameWork;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FreeCrmLoginTest {
	
	WebDriver driver;
	
	@BeforeSuite
	public void setUpProperty(){
		System.setProperty("webdriver.chrome.driver", "C://Users//Swastik Computers//workspace_ee//TDD_Frame//drivers//chromedriver.exe");
		
	}
	
	@BeforeTest
	public void unused_1(){
		
	}
	
	@BeforeClass
	public void unused_2(){
		
	}
	

	@BeforeMethod
	public void enterurl(){
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/login.cfm");
	}
	
	@Test
	public void logindetails(){
		driver.findElement(By.xpath("//input[@placeholder='Login']")).sendKeys("naveenk");;
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test@123");;
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		assertEquals("CRMPRO", driver.getTitle());
	}
		
	@AfterMethod
	public void logout(){
		driver.manage().deleteAllCookies();
		driver.close();
	}
	
	@AfterClass
	public void unused_3(){
		
	}
	
	@AfterTest
	public void deletecookies(){
		
	}
	
	@AfterSuite
	public void printreport(){
		System.out.println("print the report");
	}
	
}
