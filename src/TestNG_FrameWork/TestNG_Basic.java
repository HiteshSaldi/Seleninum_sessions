package TestNG_FrameWork;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Basic {
	
/*
 * TestNG Execute the below order.
 * 
setup system property for chrome
launch Browser
login app

enter url
Google Tittle
logout from app

enter url
Serach Text
logout from app

close the Browser
delete the cookies
PASSED: getTitle
PASSED: searchText
*/

	
	/*
	 * Execute once before executing the all test annonations.
	 */
	@BeforeSuite
	public void setUpProperty(){
		System.out.println("setup system property for chrome");
	}
	
	@BeforeTest
	public void launchBrowser(){
		System.out.println("launch Browser");
	}
	
	@BeforeClass
	public void login(){
		System.out.println("login app");
	}
	
	
	
	/*
	 * If we have more than one Test anonataions are there than below
	 * annonations are repeated.
	 * 
	 * @BeforeMethod
	 * @Test(prioprity=1,groups="logo",dependentsonmethods="   ",invocationCount=4)
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @Test
	 * @AfterMethod
	 * 
	 * it will pick test randomly but execute in pair only
	 * that mentioned the above .
	 */
	
	@BeforeMethod
	public void enterurl(){
		System.out.println("enter url");
	}
	
	@Test
	public void getTitle(){
		System.out.println("Google Tittle");
	}
	
	@Test
	public void searchText(){
		System.out.println("Serach Text");
	}
	
	@AfterMethod
	public void logout(){
		System.out.println("logout from app");
	}
	
	
	
	/*
	 * Execute once after executing the all test annonations.
	 */
	
	
	@AfterClass
	public void closebrowser(){
		System.out.println("close the Browser");
	}
	
	@AfterTest
	public void deletecookies(){
		System.out.println("delete the cookies");
	}
	
	@AfterSuite
	public void printreport(){
		System.out.println("print the report");
	}
	
}
