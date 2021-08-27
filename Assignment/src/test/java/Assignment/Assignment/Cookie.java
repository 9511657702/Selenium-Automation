package Assignment.Assignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Cookie {
	 @Test
	 public void test() throws IOException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\mungle.priya\\Desktop\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://ksrtc.in/oprs-web/login/show.do");
	 driver.findElement(By.id("userName")).sendKeys("username");
	 driver.findElement(By.id("password")).sendKeys("password");
	 driver.findElement(By.id("submitBtn")).click();
	 File file1=new File("C:\\Users\\mungle.priya\\Desktop\\reports\\cookies.data");
	 try {
	 file1.createNewFile();
	 FileWriter fw=new FileWriter(file1);
	 BufferedWriter bw=new BufferedWriter(fw);
	 for(org.openqa.selenium.Cookie ck:driver.manage().getCookies()) {
	 bw.write((ck.getName()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()+";"+ck.getValue()));
	 bw.newLine();

	 }
	 bw.close();
	 fw.close();
	 }
	 catch(Exception e) {
	 System.out.println(e);
	 }}}
	




