package sampleproject;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.linkText("Become a Seller")).click();
		
		Actions act=new Actions(driver);
	   WebElement sellonline=driver.findElement(By.linkText("Sell Online"));
       act.moveToElement(sellonline).build().perform();
       
       driver.findElement(By.linkText("Shopsy")).click();
       
//       JavascriptExecutor js=(JavascriptExecutor)driver;
//      WebElement sallstories =driver.findElement(By.linkText("Download Launch Kit"));
//      js.executeScript("arguments[0].scrollIntoView();",sallstories);
       
       driver.findElement(By.name("fullName")).sendKeys("Aruna");
       String Pawin=driver.getWindowHandle();
       driver.findElement(By.linkText("Sell Mobile Online")).click();
      
       Set<String> childwin=driver.getWindowHandles();
       for(String a:childwin)
       {
    	 if(!Pawin.equalsIgnoreCase(a))
    	 {
    		 driver.switchTo().window(a);
    	 }
       }
       
      
       driver.findElement(By.xpath("(//button[@data-testid='button'])[2]")).click();
       Thread.sleep(5000);
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(0,350)");
       Thread.sleep(3000);
       js.executeScript("window.scrollBy(0,-250)");
       Thread.sleep(5000);
       driver.switchTo().window(Pawin);
       
     WebElement fendcom = driver.findElement(By.linkText("Fees and Commission"));
     act.moveToElement(fendcom).build().perform();
     driver.findElement(By.linkText("Fee Type")).click();
	}

}
