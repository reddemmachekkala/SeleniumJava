package datadrivenvalidation;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class DataDrivenValidation {
	WebDriver driver;
  @Test
  public void LoginRetesting() throws Exception{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.techlearn.in/admin");	
		

		FileInputStream fi=new FileInputStream("D:\\Tirupati2025\\TestData\\UserDataValidation.xls");
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s=w.getSheet(0);
		
		for(int i=1; i < s.getRows(); i++)
		{	
			driver.findElement(By.xpath("//input[@id='user_login']")).clear();
			driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(s.getCell(0, i).getContents());
			driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(s.getCell(1, i).getContents());
			driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
			Thread.sleep(3000);
			try
			{				
			/*	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log out"))); */
				Actions act = new Actions(driver);
				act.moveToElement(driver.findElement(By.xpath("//*[@id=\"wp-admin-bar-my-account\"]/a"))).build().perform();
				driver.findElement(By.linkText("Log Out")).click();
				System.out.println("PASS");
			}
			catch(Exception e)
			{
				System.out.println("FAIL");
			}
		}    
	}
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
}


