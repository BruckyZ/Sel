package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Select_Frames {
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/");

		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		
		//driver.switchTo().frame("packageFrame");
		//driver.findElement(By.linkText("CommandProcessor")).click();

		//driver.switchTo().frame("packageFrame");
		//driver.findElement(By.linkText("DefaultRemoteCommand")).click();
		
		
		//driver.switchTo().frame("packageFrame");
		//driver.findElement(By.linkText("SeleniumException")).click();
		
		
		//driver.switchTo().frame("classFrame");
		//driver.findElement(By.linkText("TREE")).click();
		
		//driver.switchTo().frame("classFrame");
		//driver.findElement(By.linkText("com.thoughtworks.selenium.webdriven.commands")).click();
		
	}
	
	
}
