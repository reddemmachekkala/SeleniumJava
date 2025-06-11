package actionclassprogram;

import org.testng.annotations.Test;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class RCDCDDMOKF {
	WebDriver driver;
  @Test
  public void rightclick1() throws InterruptedException{
	  driver.get("https://www.techlern.in");
	  Thread.sleep(2000);
	  Action act = new Actions(driver); 
	  act.contextClick(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-18\"]/a"))).build().perform();
  }
  @Test
  public void doubleclick() throws InterruptedException{
	  driver.get("https://www.techlearn.in/code/double-tap/");
	  Thread.sleep(2000);
	  Action act = new Actions(driver); 
//		act.doubleClick(driver.findElement(By.xpath("//button[@ondblclick=\"handleDoubleTap()\"]"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//button[@ondblclick=\"handleDoubleTap()\"]"))).doubleClick().build().perform();
  }
  @Test
  public void draganddrop() throws InterruptedException{
	  driver.get("https://www.techlearn.in/code/drag-and-drop/");
	  Thread.sleep(2000);
	  Action act = new Actions(driver); 
	  WebElement source = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"div1\"]"));
		act.dragAndDrop(source, target).build().perform();
  }
  @Test
  public void mouseover() throws InterruptedException{
	  driver.get("https://www.techlern.in");
	  Thread.sleep(2000);
	  Action act = new Actions(driver); 
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-14\"]/a"))).build().perform();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//*[@id=\"mega-menu-item-15\"]/a")).click();
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"mega-menu-item-15\"]/a"))).click().build().perform();
  }
  @Test
	public void keyboardfunctions() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
	//	act.sendkeys(keys.TAB).buld().perdorm();
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  
  }

}
