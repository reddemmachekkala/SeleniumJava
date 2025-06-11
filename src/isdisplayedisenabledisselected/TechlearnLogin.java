package isdisplayedisenabledisselected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TechlearnLogin {
	WebDriver driver;
  @Test
  public void verifyisDisplayedmethod() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		boolean lyp = driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).isDisplayed();

		if (lyp == true) {
			System.out.println("Lost your password link is displayed to click");
			driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).click();
		}

		else {
			System.out.println("Lost your password link is Not displayed to click");
		}
	}
  @Test
	public void verifyisEnabledmethod() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);

		boolean usremail = driver.findElement(By.xpath("//input[@id='user_login']")).isEnabled();

		if (usremail == true) {
			System.out.println("Username or Email text box is enabled to the enter username");
			driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("Praveen");
		} else {
			System.out.println("Username or Email text box is Not enabled to the enter username");
		}

	}

	@Test
	public void verifyisSelectedmethod() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='rememberme']")).click();
		boolean checkbox = driver.findElement(By.xpath("//input[@id='rememberme']")).isSelected();

		if (checkbox == true) {
			System.out.println("Remember me check box is Selected");
		}

		else {
			System.out.println("Remember me check box is Not Selected");
		}

	}

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
