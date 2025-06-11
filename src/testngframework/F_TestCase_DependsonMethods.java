package testngframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class F_TestCase_DependsonMethods {
	WebDriver driver;
	
  @Test(dependsOnMethods= "method2")
  
  public void method() {
	  driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("techlearnadmin");
	  driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Hello@123");
	  driver.findElement(By.xpath("//input[@id='rememberme']")).click();
  }
	  @Test
		public void method2() {
			driver.get("https://www.techlearn.in/admin");
		}

		@BeforeTest
		public void beforeTest() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			

  }
}
