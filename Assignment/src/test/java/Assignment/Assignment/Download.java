package Assignment.Assignment;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Download {
@Test
	
	public void test() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\mungle.priya\\Desktop\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver;

		driver=new ChromeDriver();

		driver.manage().window().maximize();


       driver.get("http://www.leafground.com/pages/download.html");
       
       driver.findElement(By.linkText("Download Excel")).click();
       
       File flocation=new File("C:\\download");
       
     File[] total_files=  flocation.listFiles();
     
     for (File file:total_files)
     {
    	 if (file.getName().equalsIgnoreCase("testleaf.xlsx")) {
    		 System.out.println("File is downloaded");
    		 break;
    	 }
    	 
    	 
     }
		

	} }



