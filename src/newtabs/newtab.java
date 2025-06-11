package newtabs;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class newtab  {
	WebDriver driver;
  @Test
  public void techlearn()throws InterruptedException {
		driver.get("https://www.techlearn.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Downloads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Download Eclipse']")).click();
		Thread.sleep(2000);
		
		ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://www.eclipse.org/projects/']")).click();
		
	//	driver.switchTo().window(tabs.get(0));
		driver.close();
		driver.switchTo().window(tabs.get(0));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Download Java']")).click();
	}
	
	
	@Test
	public void techlearnnewtab() throws InterruptedException {
		driver.get("https://www.techlearn.in");
		Thread.sleep(2000);
		
	//	driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.navigate().to("https://www.google.com");
		
	//	driver.close();
		Thread.sleep(2000);
		
		Set<String> obj = driver.getWindowHandles();
		Object s[] = obj.toArray();
		driver.switchTo().window(s[0].toString());

		driver.findElement(By.xpath("//a[normalize-space()='Downloads']")).click();
		}
  @BeforeTest
  public void beforeTest(ChromeDriver driver) {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
