package fBPabes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbPage {
	public void Log_Facebook(WebDriver driver){
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("selenium.webdriver123");
		 driver.findElement(By.id("pass")).sendKeys("bootcamp123");
		 driver.findElement(By.id("u_0_2")).click();
	 }
	
	 
}
