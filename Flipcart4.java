package sampleproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement Search=driver.findElement(By.name("q"));
		          Search.sendKeys("Bluetooth headset");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		
		WebElement bar=driver.findElement(By.className("_31Kbhn WC_zGJ"));
		Actions act=new Actions(driver);
		act.moveToElement(bar, -50, 0).click().build().perform();
		}

}
