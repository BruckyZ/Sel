package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_login {
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("Hi@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("jkasndk");
		driver.findElement(By.id("u_0_2")).click();
		
		String Expected = "The password you’ve entered is incorrect. Forgot Password?";
		String Actual = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/div/div")).getText();
		
		if(Expected.equals(Actual))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println(Expected);
			System.out.println(Actual);
		System.out.println("false");
		}
	}
	

}
