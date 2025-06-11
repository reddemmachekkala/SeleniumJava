package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class E_TestNG_Testcase_Execution_Description_features {
	WebDriver driver;
  
  @Test(description="verify google application")
  public void google1() {
	  driver.get("https://www.google.com");
  }
  @Test(description="Verify Selenium application")
  public void selenium() {
	  driver.get("https://www.selenium.dev");
  }
  @Test(description="Verify facebook application")
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  @Test(description="Verify zomato application")
  public void zomato() {
	  driver.get("https://www.zomato.com");
  }
  @Test(description="Verify gmail application")
  public void gmail() {
	  driver.get("https://www.gmail.com");
  }
  
  
  @Test(description="Verify twitter application")
  public void techlear() {
	  driver.get("www.x.com");
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
