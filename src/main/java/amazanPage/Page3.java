package amazanPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page3 {
	public void Verify_autosuggestion(WebDriver driver) throws InterruptedException{
		 driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[@id='siNoCoverage-announce']")).click();
		 
	 }
	
}
