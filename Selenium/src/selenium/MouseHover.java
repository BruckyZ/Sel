package selenium;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[]args)
	{
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.barnesandnoble.com/");
		
//		driver.findElement(By.linkText("html/b	ody/div[21]/div/div")).click();
//		driver.close();
		
		WebElement news = driver.findElement(By.linkText("Newsstand"));
		Actions action= new Actions(driver);
		action.moveToElement(news).build().perform();
		driver.findElement(By.linkText("Bestselling Subscriptions")).click();
		
	}

}
