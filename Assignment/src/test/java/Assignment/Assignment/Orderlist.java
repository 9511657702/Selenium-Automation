package Assignment.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Orderlist {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mungle.priya\\Desktop\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver d1;
		  
		  d1=new ChromeDriver();
		  
		  d1.get("http://www.leafground.com/pages/selectable.html");
		  
		  List<WebElement> element1=d1.findElements(By.xpath("//ol[@id='selectable']/li"));
		  
		  int length=element1.size();
		  
		  System.out.println(length);
		  
		  
		  Actions act1=new Actions(d1);
		  
		  act1.keyDown(Keys.CONTROL)
		      .click(element1.get(0))
		      .click(element1.get(2))
		      .click(element1.get(4))
		      .click(element1.get(6)).build().perform();
			  
		  }
		  
	}





