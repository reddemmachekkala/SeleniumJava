package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class K_TestNG_Testcase_Run_Groups {
	WebDriver driver;
  @Test(groups="food")
  public void swiggy() {
	  driver.get("https://www.swiggy.com");
  }
  @Test(groups="serch")
  public void google() {
	  driver.get("https://www.google.dev");
  }
  @Test(groups="bugtool")
  public void jira() {
	  driver.get("https://www.jira.com");
  }
  @Test(groups="automationtool")
  public void selenium() {
	  driver.get("https://www.selenium.com");
  }
  @Test(groups="social")
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  @Test(groups="food")
  public void redmine1() {
	  driver.get("https://www.redmine.com");
  }
  @Test(groups="bugtool")
  public void mantisbt() {
	  driver.get("https://www.mantisbt.com");
  }
	  @Test(groups={"social","email"})
		public void gmail() {
			driver.get("https://www.gmail.com");
		}
		@Test(groups="bugtool")
		public void redmine() {
			driver.get("https://www.redmine.org");
		}
		@Test(groups="social")
		public void twitter() {
			driver.get("https://www.x.com");
		}
		@Test(groups={"search","email","news"})
		public void yahoo() {
			driver.get("https://www.yahoo.com/");
		}
		@Test(groups="bugtool")
		public void bugzilla() {
			driver.get("https://www.bugzilla.org");
		}
		
		@Test(groups="news")
		public void ndtv() {
			driver.get("https://www.ndtv.com");
  }
  @BeforeTest(groups="news")
  public void beforeTest() {
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
  
  }


  @AfterTest
  public void afterTest() {
	  driver.quit();
  
  }

}
