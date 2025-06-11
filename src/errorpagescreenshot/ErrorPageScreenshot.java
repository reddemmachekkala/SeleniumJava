package errorpagescreenshot;

import org.testng.annotations.Test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ErrorPageScreenshot {
	WebDriver driver;
  @Test
  public void ErrorPageLineScreenshot() throws Exception {	
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\Tirupati2025\\Screenshots\\Errorpagescreenshot.png"));
	}
			
		@Test
		public void techlearnlogin() throws Exception {
			driver.get("https://www.techlearn.in/wp-login.php");	
			
			try
			{
					
			driver.findElement(By.id("user_login")).sendKeys("yashwanth");
			Thread.sleep(1000);
		
			driver.findElement(By.name("pwd")).sendKeys("Hello@ 123");
			Thread.sleep(1000);
			
			driver.findElement(By.id("remembermexyz")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.name("wp-submit")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.className("wp-login-lost-password")).click();
			Thread.sleep(1000);
			}
			
			catch(Exception e)
			{
				System.out.println("Error due to : "+e);
				ErrorPageLineScreenshot();
			}
			
			
		}
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
