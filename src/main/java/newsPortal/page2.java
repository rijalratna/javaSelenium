package newsPortal;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class page2 {

	public void page_2(WebDriver driver) throws IOException {
		driver.findElement(By.xpath("//a[contains(.,' D.C. United')]")).click();
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screenshot, new File("/Users/RushaBhattarai/Documents/java/project/bootCamp/output/DC_Sports.jpg"));


	}

}
