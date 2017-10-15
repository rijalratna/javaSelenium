package newsPortal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public void Home_Page(WebDriver driver) {
		driver.get("https://www.washingtonpost.com");
		driver.findElement(By.xpath("//span[contains(.,'Sign In')]")).click();
		
	}

}
