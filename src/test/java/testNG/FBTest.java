package testNG;

import org.testng.annotations.Test;

import fBPabes.FbPage;
import fBPabes.Page1;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FBTest {
	public WebDriver driver;
	@Test(description="login to facebook page")
	  public void facebookHome() throws InterruptedException {
		  FbPage fb=new FbPage();
		  fb.Log_Facebook(driver);
	  }
	@Test(description="page1")
	  public void page1() throws InterruptedException {
		  Page1 p1=new Page1();
		  p1.Search_name(driver);
		  
	  }
	
  @BeforeTest
  public void beforeTest() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
//	  Thread.sleep(10000);
//		driver.close();
  }

}
