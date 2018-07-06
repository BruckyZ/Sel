package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_Title_login {
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		
		String Expectedtitle= "Facebook - Log In or Sign Up";
		String Actualtitle=driver.getTitle();
		
		if( Expectedtitle.equals(Actualtitle))
		{
			
			System.out.println("True");
		}
		else
		{
			System.out.println(Expectedtitle);
			System.out.println(Actualtitle);
			System.out.println("False");
		}
		driver.findElement(By.id("email")).sendKeys("hey");
		driver.findElement(By.id("pass")).sendKeys("asda");
		driver.findElement(By.id("u_0_2")).click();
		

		String Expected2="The email or phone number you’ve entered doesn’t match any account. Sign up for an account.";
		String Actual2= driver.findElement(By.xpath(".//*[@id='globalContainer']/div[3]/div/div/div")).getText();
		
		if(Expected2.equals(Actual2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("Expected");
			System.out.println("Actual");
			System.out.println("False");
		}
		
	
		}
		
		
	}
	
		

