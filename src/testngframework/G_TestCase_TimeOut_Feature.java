package testngframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class G_TestCase_TimeOut_Feature {
	WebDriver driver;
	
	@Test(timeOut= 2000)
  
  public void method1() {
	  driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("techlearnadmin");
	  driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Hello@123");
	  driver.findElement(By.xpath("//input[@id='rememberme']")).click();
	  driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
	}
	  @Test
		public void method2() {
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
