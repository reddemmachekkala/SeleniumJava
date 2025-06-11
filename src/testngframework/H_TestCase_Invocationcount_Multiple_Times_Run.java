package testngframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class H_TestCase_Invocationcount_Multiple_Times_Run {
	WebDriver driver;
	
	@Test
	public void logininvalid1() {
	driver.get("https://www.techlearn.in/admin");
	
 
	  driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("techlearnadmin");
	  driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Hello@123");
	  driver.findElement(By.xpath("//input[@id='rememberme']")).click();
	  driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
	}
	  @Test(invocationCount=5)
		public void logininvalid() {
		  driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("techlearnadmin");
		  driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Hello@123");
		  driver.findElement(By.xpath("//input[@id='rememberme']")).click();
		  driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
	  }
		@BeforeTest
		public void beforeTest() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			

  }
}
