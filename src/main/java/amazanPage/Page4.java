package amazanPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Page4 {

	public void Navigate(WebDriver driver){
		 driver.navigate();
	 }
	 public void Sign_Out(WebDriver driver) throws InterruptedException{
//		 driver.get("https://www.amazon.com/");
		 Actions ac=new Actions(driver);
		 ac.moveToElement(driver.findElement(By.xpath("//span[contains(.,'Hello, selenium')]"))).build().perform();
		 System.out.println(driver.findElements(By.tagName("iframe")).size());
		 Thread.sleep(5000);
		 driver.findElement(By.linkText("Not selenium? Sign Out")).click();
	 }

}
