package amazanPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHome {
	 public void Log_In(WebDriver driver){
		driver.get("https://www.amazon.com/"); 
		driver.findElement(By.xpath("//span[contains(.,'Hello. Sign in')]")).click();
		
	 }
	 

//	 public void Search_Items(WebDriver driver){
//		 driver.findElement(By.partialLinkText("ASUS Chromebook C202SA-YS02 11.6")).click();
//	 }
//	 public void Verify_autosuggestion(WebDriver driver) throws InterruptedException{
//		 driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
//		 Thread.sleep(3000);
//		 driver.findElement(By.xpath("//button[@id='siNoCoverage-announce']")).click();
//		 
//	 }
//
//	 public void Navigate(WebDriver driver){
//		 driver.navigate();
//	 }
//	 public void Sign_Out(WebDriver driver) throws InterruptedException{
//		 driver.get("https://www.amazon.com/");
//		 Actions ac=new Actions(driver);
//		 ac.moveToElement(driver.findElement(By.xpath("//span[contains(.,'Hello, selenium')]"))).build().perform();
//		 System.out.println(driver.findElements(By.tagName("iframe")).size());
//		 Thread.sleep(5000);
//		 driver.findElement(By.linkText("Not selenium? Sign Out")).click();
//	 }
	 
}
