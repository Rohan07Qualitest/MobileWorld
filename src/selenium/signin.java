package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class signin {
  public void F() throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rohan.baisa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//button[normalize-space()='SIGN IN']")).click();
		driver.findElement(By.cssSelector("button[type='submit'")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username'][1]")).sendKeys("Qualitest");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Qualitest@123");
	    Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[type='submit']")).click();
        Thread.sleep(5000);
        driver.close();
	}

}
