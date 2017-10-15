package newsPortal;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class page1 {

	public void page_1(WebDriver driver) throws IOException {
		driver.findElement(By.xpath("//a[@href='http://www.washingtonpost.com/sports/?nid=top_nav_sports']")).click();
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(screenshot, new File("/Users/RushaBhattarai/Documents/java/project/bootCamp/output/sport_page.jpg"));

	}

}
