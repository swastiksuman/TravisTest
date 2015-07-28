package travis_test.travis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest{
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		System.out.println("Some Setup");
	}
	
	@Test
	public void test(){
		driver=new HtmlUnitDriver();
		driver.get("http://www.google.com/");
		System.out.println("Google Opened");
	
	}
	
	@AfterTest
	public void afterClean(){
		driver.close();
		driver.quit();
	}

}
