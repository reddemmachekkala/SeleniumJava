package timeformatescreenshot;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TimeformatScreenshot {
	WebDriver driver;
	private Object FileUtils;
  @Test
  public void TakeScreenshot() throws IOException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date = new Date();
		String time = dateFormat.format(date);
//		System.out.println(time);

		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\Tirupati2025\\Screenshots\\Techlearn_" + time + ".png"));
	}	

		@Test
		public void techlearn() throws Exception {
			driver.get("https://www.techlearn.in/wp-login.php");
			Thread.sleep(1000);
			TakeScreenshot();
			driver.findElement(By.id("user_login")).sendKeys("yashwanth");
			Thread.sleep(1000);
			TakeScreenshot();
			driver.findElement(By.name("pwd")).sendKeys("Hello@ 123");
			Thread.sleep(1000);
			TakeScreenshot();
			driver.findElement(By.id("rememberme")).click();
			Thread.sleep(1000);
			TakeScreenshot();
			driver.findElement(By.name("wp-submit")).click();
			Thread.sleep(1000);
			TakeScreenshot();
			driver.findElement(By.className("wp-login-lost-password")).click();
			Thread.sleep(1000);
			TakeScreenshot();

		}

		@Test(enabled=false)
		public void facebook() throws Exception {
			driver.get("http://seleniumlearn.com/selenium-commands");
			Thread.sleep(6000);
			TakeScreenshot();
			String selectalltext = Keys.chord(Keys.CONTROL, "a"); // select all text in techlearn.in home page
			driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).sendKeys(selectalltext);		           
			TakeScreenshot();
		}
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
