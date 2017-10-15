package junitTest;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import amazanPage.AmazonHome;

public class AmazanTest {
	public static WebDriver driver;
	@Before
	public void setUp() throws Exception {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.close();
	}

	@Test
	public void test() {
		AmazonHome ah=new AmazonHome();
		ah.Log_In(driver);
	}

}
