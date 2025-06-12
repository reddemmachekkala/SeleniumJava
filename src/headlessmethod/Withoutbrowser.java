package headlessmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Withoutbrowsers() {

@Test
  public void withoutbrowsers() {
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("headless");
	 WebDriver driver = new ChromeDriver(co); 
	   
	// driver = new ChromeDriver();
	// driver.manage().window().maximize();
	  
	  
	  driver.get("https://www.google.com/");
	  
	  String exptab = "Google";
	  
	  String acttab = driver.getTitle();
	  
	  Assert.assertEquals(acttab, exptab);
  }

}