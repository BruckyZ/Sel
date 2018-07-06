package selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class List_Array 
{
	public static void main(String[]args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50 ,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get("http://dstravelandtour.com/");
		driver.get("http://www.dstravelandtour.com/index.php/about-us");
		
		//// Mouse Hover Eg:
//		WebElement news = driver.findElement(By.linkText("ATTRACTIONS"));
//		Actions action= new Actions(driver);
//		action.moveToElement(news).build().perform();
//		driver.findElement(By.linkText("Historical attractions")).click();
//		
//		if(driver.getTitle().equals("Historical attractions"))
//		{
//			System.out.println("True");
//		}
//		else
//			System.out.println("False");
	
		List<WebElement> link = driver.findElements(By.tagName("a"));
		String[] LinkText = new String[link.size()];
		int i=0;
		 
		
		for(WebElement E : link)
		{
			LinkText[i]= E.getText();
			 i++;
		}
		
		for(String t : LinkText)
		{
			driver.findElement(By.linkText(t)).click();
				
			if(driver.getTitle().equals("Under Construction: Mercury Tours"))
			{
				System.out.println(t + " = ERROR");
			}
			else
			{
				System.out.println(t +  " = CORRECT");
			}
			driver.navigate().back();
		}
	driver.quit();
		
				
	}
}
