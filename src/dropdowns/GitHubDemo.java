package dropdowns;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;


public class GitHubDemo {
	WebDriver driver;
  @Test
  public void googlesearch() {
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("Test GitHub");
  }
  @BeforeTest
  public void beforeTest() {
	   driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
