package datadriverreadstore;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.awt.Label;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DataDriverReadStore {
	WebDriver driver;
	public String str;
  @Test
  public void PrintTestResultsinSheetVarm() throws Exception {
		
		
	// Reading the data from the input file
	FileInputStream fi = new FileInputStream("D:\\Sandhya\\TestData\\UserDataValidation.xls");
	Workbook w = Workbook.getWorkbook(fi);
	Sheet s = w.getSheet("Sheet1");
	
	// Creating the result file under the result folder
	FileOutputStream fo = new FileOutputStream("D:\\Sandhya\\TestData\\TestOutputResults.xls");
	WritableWorkbook wb = Workbook.createWorkbook(fo);
	WritableSheet ws = wb.createSheet("Results", 0);
	
	for (int i = 1; i < s.getRows(); i++) {
// Take the username, password and click on signin by taking the testdata from excel file
		driver.get("https://www.techlearn.in/wp-login.php");
		Thread.sleep(3000);
	//	driver.findElement(By.id("edit-name")).clear();
	//    driver.findElement(By.id("edit-name")).sendKeys(Keys.CONTROL, "a");
		driver.findElement(By.id("user_login")).clear();
		driver.findElement(By.id("user_login")).sendKeys(s.getCell(0, i).getContents());
		driver.findElement(By.id("user_pass")).sendKeys(s.getCell(1, i).getContents());
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(5000);

		// Validate logout, if available assign pass to str, else assign fail to str
		try {
			driver.findElement(By.linkText("Log out")).click();
			str = "Success";
		//	System.out.println(str);
			
		} catch (Exception e) {
			str = "FAIL";
		//	System.out.println(str);
		}

		// Add the str value under the Result column
		Label result = new Label(2, i, str);
		ws.addCell(result);
		// Add the input data to the Result file
		for (int j = 0; j < s.getColumns(); j++) {
			System.out.println(s.getCell(j, i).getContents());
			Label l = new Label(j, i, s.getCell(j, i).getContents());
			ws.addCell(l);
		}
	}
	// Add the Heading
	Label un = new Label(0, 0, "Username");
	Label pw = new Label(1, 0, "Password");
	Label rs = new Label(2, 0, "Status");
	ws.addCell(un);
	ws.addCell(pw);
	ws.addCell(rs);
	// Write and close the Result file
	wb.write();
	wb.close();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
