package FBSignupBDDandPropertyFile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;

public class StepDefn {
	public static WebDriver driver;
  @Given("^open the page and prepare boruser$")
  public void open_the_page() throws Throwable {
	  driver=new ChromeDriver();
  }

  @When("^open facebook page for login$")
  public void open_facebook() throws Throwable {
	  driver.get("http://www.facebook.com");
  }

  @And("^i am puting email as \"(.*)\"$")
  public void i_am_puting_email(String arg) throws Throwable {
	  String stri=readproperty(arg).toString();
	  driver.findElement(By.id("email")).sendKeys(stri);
  }

  @And("^i am puting pass as \"(.*)\"$")
  public void i_am_puting_pass(String arg) throws Throwable {
	  driver.findElement(By.id("pass")).sendKeys(arg);  
  }

  @Then("^click on login pages$")
  public void click_on_login_pages() throws Throwable {
	  driver.findElement(By.id("u_0_2")).click();
  }
  
  public String readproperty(String str) throws IOException{
	  Properties prop = new Properties();
		InputStream input = null;

			input = new FileInputStream("C:\\Users\\PIIT\\eclipse-workspace\\bootCamp\\src\\test\\java\\FBSignupBDDandPropertyFile\\pro.properties");
			

			// load a properties file
			prop.load(input);
			
			return prop.getProperty(str);

  }
  


}
