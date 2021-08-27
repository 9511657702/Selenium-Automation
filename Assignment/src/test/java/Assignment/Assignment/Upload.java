package Assignment.Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\mungle.priya\\Desktop\\chromedriver_win32\\chromedriver.exe");

		WebDriver d1;

		d1=new ChromeDriver();

		d1.manage().window().maximize();

	d1.get("https://www.ilovepdf.com/word_to_pdf");
	
	d1.findElement(By.id("pickfiles")).click();
	
	String file="C:\\Users\\mungle.priya\\Downloads\\priya1.docx";
	
	StringSelection select1=new StringSelection(file);
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select1, null);
	
	Thread.sleep(4000);
	
	Robot robot1=new Robot();
	
	robot1.keyPress(KeyEvent.VK_CONTROL);
	
	robot1.keyPress(KeyEvent.VK_V);
	
	robot1.keyRelease(KeyEvent.VK_V);
	
	robot1.keyRelease(KeyEvent.VK_CONTROL);
	
	robot1.keyPress(KeyEvent.VK_ENTER);
	
	 }
}



