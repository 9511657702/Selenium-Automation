package Assignment.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Doubleclick {
	@Test
	  public void f() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\mungle.priya\\Desktop\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver d1;
		  
		  d1=new ChromeDriver();
		  
		  d1.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  
		  d1.get("http://www.leafground.com/pages/Edit.html");
		  
		  WebElement element1=d1.findElement(By.id("email"));
		  
		  Actions act1=new Actions(d1);
		  
		  act1.sendKeys(element1, "priya")
		      .doubleClick()
	          .contextClick().build().perform();	  
		  
		  
		  }
		  

}
