package newsPortal;

import org.openqa.selenium.WebDriver;

public class Login_page {

	public void Loginpage(WebDriver driver) throws InterruptedException {
		System.out.println(driver.getWindowHandles().size());
//		driver.get("https://www.washingtonpost.com/regional/?cache=false");
		driver.navigate().back();
	}

}
