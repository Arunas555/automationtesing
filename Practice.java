package sampleproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver","C://Users//hp//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.name("firstname")).sendKeys("Aruna");
		driver.findElement(By.name("lastname")).sendKeys("Shinde");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("1231231230");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("aruna@123");
		
		WebElement date= driver.findElement(By.name("birthday_day"));
		Select s= new Select(date);
		s.selectByIndex(5);
		
		WebElement birth= driver.findElement(By.name("birthday_month"));
		Select s1= new Select(birth);
		s1.selectByValue("6");
		
		WebElement year= driver.findElement(By.id("year"));
		Select s2= new Select(year);
		s2.selectByVisibleText("1997");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
//		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		
		
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	WebElement text=driver.findElement(By.linkText("Already have an account?"));
		  System.out.println(text.getText());
		
	}

}
