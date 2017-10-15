package fBPabes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Page1 {
	 public void Search_name(WebDriver driver) throws InterruptedException{
		 Thread.sleep(2000);
//		 WebElement scarch=driver.findElement(By.xpath(".//*[@id='u_5_2']/input[1]"));
		 WebElement scarch=driver.findElement(By.name("q"));
		 scarch.click();
		 scarch.sendKeys("selenium webdriver");
		 driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
		 Actions ac=new Actions(driver);
		 ac.moveToElement(driver.findElement(By.partialLinkText("Selenium Webdriver"))).build().perform();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[contains(.,'plusJoin Group')]")).click(); 
	 }

	 
}
