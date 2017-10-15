package amazanPage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonLogin {

	
		public void sinInAmazon (WebDriver driver) throws IOException{
			File file=new File("/Users/RushaBhattarai/Documents/java/project/bootCamp/pasword.xlsx");
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			System.out.println(wb);
			Sheet st=wb.getSheetAt(0);
			Row rw=st.getRow(2);
			Cell username=rw.getCell(0);
			Cell password=rw.getCell(1);
			String user=username.getStringCellValue();
			String pass=password.getStringCellValue();
			driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(user);
			driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(pass);
			driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		 }
		
	

}
