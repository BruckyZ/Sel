package selenium;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_1 {
//{
//
//	  public void setUp() throws Exception {
//	        System.setProperty("webdriver.gecko.driver", "C:\\SeleniumGecko\\geckodriver.exe");
//	  }
	//driver.findElement(By.name("email")).sendKeys("bz@gmail.com");
	//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("ajbsd");
	//driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("hasd@gmail.com");
	//driver.findElement(By.id("u_0_2")).click();
	//driver.findElement(By.linkText("Mobile")).click();
	//driver.close();
	
	public static void main(String[]args){
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50 ,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("asjdb@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("asdasd");
//		driver.findElement(By.id("u_0_2")).click();
//		String expected = "The email you’ve entered doesn’t match any account. Sign up for an account.";
//		String actual = driver.findElement(By.xpath(".//*[@id='globalContainer']/div[3]/div/div/div")).getText();
//		
//		if (expected.equals(actual))
//		{
//			System.out.println("Test Passed");
//		}
//		
//		else
//		{
//			System.out.println("Test Failed");
//		}
//		System.out.println(actual);
//		System.out.println(expected);
	}
}



