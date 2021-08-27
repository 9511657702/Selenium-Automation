package Assignment.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unorderlist {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mungle.priya\\Desktop\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver d1;
		  
		  d1=new ChromeDriver();
		  
		  d1.get("http://www.leafground.com/pages/autoComplete.html");
		  
		  d1.findElement(By.id("tags")).sendKeys("A");
		  
		  Thread.sleep(4000);
		  
		List<WebElement> ele1=  d1.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		  
		int len=ele1.size();
		
		System.out.println(len);
		
		Thread.sleep(4000);
		
		for(WebElement list_values:ele1) {
			if (list_values.getText().equalsIgnoreCase("SOAP")) {
				
				list_values.click();
				break;
			}
		}
		
		
		
		
		  
		  
		  }
		  
	}

