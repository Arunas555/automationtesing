package sampleproject;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement Search=driver.findElement(By.name("q"));
		          Search.sendKeys("Bluetooth headset");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String Parentwin = driver.getWindowHandle();
		WebElement Frame=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[1]/div[1]/div/div/img"));
		Frame.click();
		
		
		Set<String> Childwin =driver.getWindowHandles();
		
		for(String allwin : Childwin )
		{
			if(!Parentwin.equalsIgnoreCase(allwin))
			{
				driver.switchTo().window(allwin);
		    }
         }
		
	     
       driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _3-J4S1']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(Parentwin);
		
//	back to search page-cart
		
	 String parentwin=driver.getWindowHandle();
	 driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
	 Set<String> childwin2=driver.getWindowHandles();
	 
	 for(String a:childwin2)
	 {
		 if(!parentwin.equalsIgnoreCase(a))
		 {
			 driver.switchTo().window(a);
		 }
	 }
		
	driver.findElement(By.xpath("//div[normalize-space()='Remove']")).click();
	
	driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']")).click();
	driver.switchTo().window(parentwin);
	
	


	}

}
