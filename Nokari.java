package sampleproject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;


public class Nokari {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	    
	    driver.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]")).click();
		
//		 click on menu(Sidebar)
	    driver.findElement(By.xpath("//button[normalize-space()='Open Menu']")).click();
	    Thread.sleep(5000);
//	    About page
	    driver.findElement(By.xpath("//a[@id='about_sidebar_link']")).click();
	    Thread.sleep(4000);
//	    click on requestdemo
	    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	    Thread.sleep(3000);
	    
//	    driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("aruna@gmail.com");
   
//	   JavascriptExecutor js=(JavascriptExecutor)driver;
//	    js.executeScript("window.scrollBy(0, 500)");
//	    WebElement get=driver.findElement(By.xpath("//button[@type='submit']"));
//	   System.out.println(get.getText()); 
	   
	   driver.findElement(By.linkText("Home")).click();
	    
	    
		}

}
