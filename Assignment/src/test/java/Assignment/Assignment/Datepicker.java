package Assignment.Assignment;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\mungle.priya\\Desktop\\chromedriver_win32\\chromedriver.exe");

		WebDriver d1;

		d1=new ChromeDriver();
		
		d1.manage().window().maximize();

		d1.get("http://demo.automationtesting.in/Datepicker.html");

	
        JavascriptExecutor jse=(JavascriptExecutor) d1;
        
        jse.executeScript("document.getElementById('datepicker2').value='29/08/2021'");
        
}

}
