package pagescrolldownandup;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.BeforeTest;

public class PageScrollDownUp {
	WebDriver driver;
  @Test
  public void scrolldown()throws InterruptedException {
		driver.get("https://www.selenium.dev");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
		Thread.sleep(3000);		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 3400)");		
		Thread.sleep(3000);		
	//	driver.findElement(By.xpath("//a[normalize-space()='Ecosystem page']")).click();
	}	
	@Test
	public void scrollup() throws InterruptedException {
	//	driver.get("https://www.selenium.dev");
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
	//	Thread.sleep(3000);		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(3400, 0)");		
		Thread.sleep(3000);		
	//	driver.findElement(By.xpath("//a[normalize-space()='Ecosystem page']")).click();
	}
	
	
	@Test 
  public void IndentifyLoacatorElement() throws Exception {
		driver.get("https://www.selenium.dev");
		driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
  {
      WebElement element = (WebElement) driver.findElement(By.xpath("//a[normalize-space()='Ecosystem page']"));
      Coordinates coordinate = ((Locatable)element).getCoordinates(); 
      coordinate.onPage(); 
      coordinate.inViewPort();
       }    
  driver.findElement(By.xpath("//a[normalize-space()='Ecosystem page']")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
