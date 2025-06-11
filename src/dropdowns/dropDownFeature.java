package dropdowns;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class dropDownFeature {
	WebDriver driver;
  @Test
  public void dropdownSelection()throws InterruptedException { 
	  driver.get("https://www.redmine.org");
	  driver.findElement(By.xpath("//a[@class='register']")).click();
	  driver.findElement(By.xpath("//input[@id='user_mail']")).sendKeys("techlearn.india@gmail.com");
		Thread.sleep(2000);
		Select lan = new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
