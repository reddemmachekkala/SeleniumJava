package iframes;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class iframesHandles {
	WebDriver driver;
  @Test
  public void frames()throws InterruptedException { 
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  		
	  		driver.switchTo().frame("iframeResult");
	  		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  		driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
//			driver.switchTo().parentFrame();
			driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
	  		
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
