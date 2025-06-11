package alerts;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class popupAlerts {
	WebDriver driver;
  @Test
  public void pressokbuttoninalertwindow1() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  
  }
	  @Test
	  public void presscanelbuttoninalertwindow1() throws InterruptedException {
		  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		  Thread.sleep(2000);
		  driver.switchTo().alert().dismiss();
  }
	  @Test
	  public void entertextpressokcanelbuttoninalertwindow() throws InterruptedException {
		  driver.get("https://www.techlearn.in/code/prompt-dialog-box//");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		  Thread.sleep(2000);
		  Alert a= driver.switchTo().alert();
		  a.sendKeys("Reddy");
		  a.accept();
	  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
