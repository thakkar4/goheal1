package testy;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestOne {
	
	WebDriver driver = new ChromeDriver();
	@Test
	
	public void hope()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
	    driver.get("https://www.facebook.com");
		
	}
	
	@Test
	
	public void login()
	{
		
		driver.findElement(By.id("email")).sendKeys("thakkar4@yahoo.com");
		driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy")).sendKeys("Hit$8381");
	}

}
