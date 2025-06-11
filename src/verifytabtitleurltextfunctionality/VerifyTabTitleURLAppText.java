package verifytabtitleurltextfunctionality;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class VerifyTabTitleURLAppText {
	WebDriver driver;
  @Test
  public void verifytabtitle() {
	  
	  driver.get("https://www.google.com");

		String exptabtext = "Google";
		System.out.println("Expected Tab title is :" + exptabtext);

		WebDriver driver = null;
		String acttabtext = driver.getTitle();
		System.out.println("Actual Tab title is :" + acttabtext);

		Assert.assertEquals(acttabtext, exptabtext);
  }
		@Test
		public void verifyapplicationurl() {
			driver.get("https://www.google.com");

			String expurl = "https://www.google.com/";
			String acturl = driver.getCurrentUrl();

			Assert.assertEquals(acturl, expurl);
		}

		@Test
		public void verifyapplicationtext() {
			driver.get("https://www.google.com");

			String expgtext = "Gmail";

			String actgtext = driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/a")).getText();

			Assert.assertEquals(actgtext, expgtext);

			String expimgtext = "Images";

			String actimgtext = driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[2]/a")).getText();

			Assert.assertEquals(actimgtext, expimgtext);
		

	
  }
  @BeforeTest
  public void beforeTest() {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
  }

}
