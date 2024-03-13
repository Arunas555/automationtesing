package sampleproject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart2 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
	   
        WebElement login =driver.findElement(By.xpath("(//a[@title='Login'])[1]"));
        Actions act=new Actions(driver);
        act.moveToElement(login).build().perform();
        
        
      WebElement Flippz= driver.findElement(By.xpath("//a[@title='Flipkart Plus Zone']"));
      act.click(Flippz).build().perform();
      
     
    
     JavascriptExecutor js=(JavascriptExecutor)driver;
         WebElement Offertext=driver.findElement(By.xpath("(//img[@alt='SCRewards-Header2'])[1]"));
        System.out.println(Offertext.getText());
        js.executeScript("arguments[0].scrollIntoView();",Offertext);      
      
       
        
	}

}
