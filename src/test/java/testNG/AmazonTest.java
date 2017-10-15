package testNG;

import org.testng.annotations.Test;

import amazanPage.AmazonHome;
import amazanPage.AmazonLogin;
import amazanPage.Page1;
import amazanPage.Page2;
import amazanPage.Page3;
import amazanPage.Page4;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AmazonTest {
	public static WebDriver driver;


	@Test(description="Navigates to the amazon page")
	public void homepage() throws InterruptedException {
			AmazonHome ah=new AmazonHome();
		  ah.Log_In(driver);
	  }	
	@Test(description="login to the amazon page")
	  public void logOnAmazon() throws InterruptedException, IOException {
			AmazonLogin al=new AmazonLogin();
			al.sinInAmazon(driver);
	  }	
	@Test(description="select the product item")
public void product_page() {
		Page1 p1=new Page1();
		p1.products(driver);
  }
	@Test(description="we searching laptop on amazon")
public void search_Page() throws InterruptedException {
		Page2 p2=new Page2();
		p2.Search_Items(driver);
  }
	@Test(description="we verify it for item is correct or not")
public void veryfy_page() throws InterruptedException {
		Page3 p3=new Page3();
		p3.Verify_autosuggestion(driver);
  }
	@Test(description="we are sign out from amazon")
public void Logout_page() throws InterruptedException {
		Page4 p4=new Page4();
		p4.Sign_Out(driver);
  }
	
	
	
	
	
	
	
	
	
  @BeforeTest
  public void beforeTest() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		System.out.println("running");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(10000);
		driver.close();
  }

}
