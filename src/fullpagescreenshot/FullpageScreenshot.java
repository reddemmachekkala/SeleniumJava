package fullpagescreenshot;

import org.testng.annotations.Test;

import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v134.page.model.Screenshot;
import org.testng.annotations.BeforeTest;

public class FullpageScreenshot {
	WebDriver driver;
  @Test
  public void CompletePageScreenshot() throws IOException, Exception{
		driver.get("https://www.kmrlawcollege.com/");
		Thread.sleep(3000);
		Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(s.getImage(), "PNG", new File("D:\\Tirupati2025\\Screenshots\\FullpageScreenshot.png"));
	}
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
	  
  }

}
