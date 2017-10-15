package amazanPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page2 {
	public void Search_Items(WebDriver driver){
		 driver.findElement(By.partialLinkText("ASUS Chromebook C202SA-YS02 11.6")).click();
	 }
}
