package amazanPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page1 {
	public void products(WebDriver driver){
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop"); 
		 driver.findElement(By.xpath("//input[@value='Go']")).click();
	 }
}
