package Assignment.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Krstc {


    @Test
   public void registration() throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\mungle.priya\\Desktop\\chromedriver_win32\\chromedriver.exe");
      WebDriver d1 =new ChromeDriver();
      d1.get("https://ksrtc.in/oprs-web/user/add.do");
      d1.manage().window().maximize();
      Thread.sleep(1000);
      
      //Scroll down the page
      JavascriptExecutor js = (JavascriptExecutor) d1; /// Scroll down
      js.executeScript("window.scrollBy(0,200)");
      
    
     //Registration page/
      d1.findElement(By.name("email")).sendKeys("priyamungle11@gmail.com");
      d1.findElement(By.id("fullName")).sendKeys("Priya Bhimrao Mungle");
      d1.findElement(By.name("mobileNo")).sendKeys("9511657702");
      d1.findElement(By.name("SaveBtn")).click();
      System.out.println("Registration Sucessfull");
     // d1.switchTo().alert().accept();
      Thread.sleep(1000);
 
     
      //Sign in page//
      d1.findElement(By.xpath("//a[@href='/oprs-web/login/show.do']")).click();
      d1.findElement(By.id("userName")).sendKeys("priyamungle11@gmail.com");
      d1.findElement(By.name("password")).sendKeys("Priya@123");
      d1.findElement(By.id("submitBtn")).click();
      Thread.sleep(1000);
    
      // Scroll down the page//
      JavascriptExecutor js1 = (JavascriptExecutor) d1; 
      js1.executeScript("window.scrollBy(0,200)");
      
      //Searching a bus//
      
      //1. leaving from
      d1.findElement(By.id("fromPlaceName")).sendKeys("PUNE"+Keys.ARROW_DOWN+Keys.ENTER);
      Thread.sleep(1000);
      
      // 2.To place
      d1.findElement(By.id("toPlaceName")).sendKeys("PUNE"+Keys.ARROW_DOWN+Keys.ENTER);
     
      Thread.sleep(1000);
      
      //3.Date Selection
      JavascriptExecutor jse= (JavascriptExecutor)d1;
      jse.executeScript("document.getElementById('txtJourneyDate').value='30/08/2021'");
      jse.executeScript("document.getElementById('txtReturnJourneyDate').value='30/09/2021'");
      
      
      //5.search the button
      d1.findElement(By.id("corover-close-btn")).click();
      d1.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
      }
      
  }
 


