package testNG;

import org.testng.annotations.Test;

import newsPortal.HomePage;
import newsPortal.Login_page;
import newsPortal.page1;
import newsPortal.page2;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewsPortalTest {
	public static WebDriver driver;
	@Test(description="we verify it is correct page called News portal")
	  public void brouse_news_portal() {
		HomePage hp=new HomePage();
		hp.Home_Page(driver);
	  }
	@Test(description="we lgoing to newsportal page and read news")
	  public void login() throws InterruptedException {
		Login_page lp=new Login_page();
		lp.Loginpage(driver);
	  }
	@Test(description="we are going to sports and screenshoot news")
	  public void navigate_back() throws IOException {
		page1 p1=new page1();
		p1.page_1(driver);
		
	  }
	@Test(description="we are going to dc sporrts and take screenshoot of this news")
	  public void sport_page() throws IOException {
		page2 p2=new page2();
		p2.page_2(driver);
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
