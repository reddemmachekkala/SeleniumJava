package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D_TestNG_Testcase_Execution_priority_Order {
	WebDriver driver;
  @Ignore
  @Test(priority=3)
  public void google1() {
	  driver.get("https://www.google.com");
  }
  @Test(priority=1)
  public void selenium() {
	  driver.get("https://www.selenium.dev");
  }
  @Test(priority=4,enabled=false)
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  @Test(priority=0)
  public void zomato() {
	  driver.get("https://www.zomato.com");
  }
  @Test(enabled=false,priority=2)
  public void gmail() {
	  driver.get("https://www.gmail.com");
  }
  
  
  @Test(priority=5,enabled=true)
  public void techlear() {
	  driver.get("https://www.techlearn.com");
  }
  @BeforeTest
  public void beforeTest() {
	  driver= new ChromeDriver();
	  driver().manage().window().maximize();
  
  }

  private WebDriver driver() {
	// TODO Auto-generated method stub
	return null;
}
  @AfterTest
  public void afterTest() {
	  driver.quit();
  
  }

}
