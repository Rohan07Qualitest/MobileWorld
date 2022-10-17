package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class signup {
	public void P()

	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rohan.baisa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://mobileworld.banyanpro.com/");
	    driver.findElement(By.cssSelector("button.btn.btn-warning.my-2.my-sm-0")).click();
	    driver.findElement(By.linkText("Sign up")).click();
	    // Thread.sleep(5000);
	    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Rohan");
	    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Baisa");
	    //Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("br@gmail.com");
	    driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("accepted");
	    //Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='date']")).sendKeys("18");
	    driver.findElement(By.xpath("//input[@type='date']")).sendKeys("05");
	    driver.findElement(By.xpath("//input[@type='date']")).sendKeys("2000");
	    driver.findElement(By.xpath("//input[@type='radio']")).click(); 	 	
	    ///driver.findElement(By.className("Female")).click();
	    ///driver.findElement(By.xpath("/div/)).click();
	    driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("7732054722");
	    //driver.findElement(By.xpath("//input[@min='0']")).sendKeys("");
	    driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Hey You!!");
	    driver.findElement(By.cssSelector("button.btn.btn-info.form-control")).click();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.switchTo().alert().accept();
	    driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   // driver.switchTo().alert().accept();
	   // System.out.println(driver.switchTo().alert().getText());
	    
    driver.quit();
	}

}
