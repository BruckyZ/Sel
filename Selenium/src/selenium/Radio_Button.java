package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Radio_Button {
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		driver.get("https://facebook.com");
		
		driver.findElement(By.xpath(".//*[@id='u_0_c']")).sendKeys("Belachew");
		driver.findElement(By.xpath(".//*[@id='u_0_e']")).sendKeys("Hagose");
		driver.findElement(By.id("u_0_h")).sendKeys("belay2000@gmail.com");
		driver.findElement(By.id("u_0_o")).sendKeys("2Hagose@2000");

		// Note: IF THE SELECTED VALUE ARE LESS USE (SELECTBYINDEX(WHERE THE FIRST NUMBER IS 0 THEN CONTINUE COUNTING) IF VALUE ARE MORE USE BY VALUE)
		//USE THE BELOW WHILE SELECTING DROP DONW BOX
		WebElement x= driver.findElement(By.id("month"));
		Select Birthday = new Select(x);
		Birthday.selectByVisibleText("Jan");
		
		WebElement y = driver.findElement(By.id("day"));
		Select Day = new Select(y);
		Day.selectByVisibleText("4");	

		WebElement z= driver.findElement(By.id("year"));
		Select year= new Select(z);
		year.selectByVisibleText("2000");
		
		//RADIO BUTTON TO SELECT FEMALE
//		WebElement female = driver.findElement(By.xpath(".//*[@id='u_0_9']"));
//		female.click();
		
		//RADIO BUTTON TO SELECT MALE
		WebElement male= driver.findElement(By.id("u_0_a"));
		male.click();
		
		driver.findElement(By.xpath(".//*[@id='u_0_u']")).click();
		
		//CHECK BOX BUTTON TO SELECT CHECK BOX
		//WebElement check_box= driver.findElement(By.id("???"));
		//check_box.click();
		
		String Expected = "Please re-enter your email address";
		String Actual= driver.findElement(By.id("u_0_k")).getText();
		
		if(Expected.equals(Actual))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println(Expected);
			System.out.println(Actual);
			System.out.println("False");
		}
	
	}
}
