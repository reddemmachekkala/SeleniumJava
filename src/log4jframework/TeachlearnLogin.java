package log4jframework;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class TeachlearnLogin {
	WebDriver driver;
  @Test
  public void login() {
	  Logger log= Logger.getLogger("TechlearnLogin");
		PropertyConfigurator.configure("Log4j.properties");
		
		driver = new SafariDriver();
		log.info("Safari browser Launched");		
		
		driver.manage().window().maximize();
		log.info("Browser window Maximized");
		
		
		driver.get("https://www.techlearn.in/admin");
		log.info("Navigate to the Techlearn Login Page");
		
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("chanukya");
		log.info("Enter the username chanukya in username field");
		
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("123");
		log.info("Enter the password is 123 in Password field");
		
		driver.findElement(By.xpath("//input[@id='rememberme']")).click();
		log.info("Rememer me check box is Selected");
		
		
  }
}
