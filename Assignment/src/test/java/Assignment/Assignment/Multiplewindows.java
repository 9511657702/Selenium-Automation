package Assignment.Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Multiplewindows {
	 @Test
	  public void f() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\mungle.priya\\Desktop\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver d1;
		  
		  d1=new ChromeDriver();
		  
		  d1.get("http://www.leafground.com/pages/Window.html");
		  
		  d1.findElement(By.id("home")).click();
		  
		  Set<String> window_values=  d1.getWindowHandles();
		  
		  Iterator<String> it1=  window_values.iterator();
		  
		  String w1=it1.next();
		  
		  System.out.println(w1);
		  
		 String w2= it1.next();
			  
		  System.out.println(w2);  
		  
		  d1.switchTo().window(w2);
		
		  System.out.println(d1.getTitle());
	
			  
		  }
		  
		  
		  
	  }


