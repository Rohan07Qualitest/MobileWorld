package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class homepage {

	WebDriver driver;

	@Test
	public void launchBrowser () throws InterruptedException {
		
	
		String browserName = "chrome";
		// TODO Auto-generated method stub
		if(browserName  == "chrome") {
System.setProperty("webdriver.chrome.driver","C:\\Users\\rohan.baisa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
       driver = new ChromeDriver();
		}
	
	
		else if(browserName  == "edge"){
System.setProperty("webdriver.edge.driver","C:\\Users\\rohan.baisa\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		}

driver.get("https://qualicoach.org/mwapp/index.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("navbarDropdown")).click();
Thread.sleep(1000);
driver.findElement(By.linkText("Samsung")).click();
Thread.sleep(1000);

driver.findElement(By.linkText("More Details")).click();
Thread.sleep(1000);
driver.findElement(By.className("nav-link")).click();
Thread.sleep(1000);
driver.findElement(By.id("navbarDropdown")).click();
driver.findElement(By.linkText("Lenovo")).click();
Thread.sleep(1000);
driver.findElement(By.id("navbarDropdown")).click();
Thread.sleep(1000);
driver.findElement(By.linkText("Apple")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//a[@id='navbarDropdown'][contains(.,'Support')]")).click();
Thread.sleep(1000);
driver.findElement(By.linkText("Order")).click();
Thread.sleep(1000);
Set<String> windowHandles=driver.getWindowHandles();
List<String> windowHandlesList = new ArrayList<>(windowHandles);
Thread.sleep(1000);
//System.out.println("Total window number" + windowHandlesList.size() +"\n");
driver.switchTo().window(windowHandlesList.get(1));
Thread.sleep(1000);
driver.findElement(By.linkText("Home")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//a[@id='navbarDropdown'][contains(.,'Support')]")).click();
Thread.sleep(1000);
driver.findElement(By.linkText("Contact Us")).click();
Thread.sleep(1000);
//System.out.println("Total window number" + windowHandlesList.size() +"\n");
driver.switchTo().window(windowHandlesList.get(0));
System.out.println(windowHandlesList);
Thread.sleep(1000);
System.out.println(driver.getWindowHandles());
System.out.println(driver.findElement(By.className("footer")).getText());
Thread.sleep(1000);
driver.findElement(By.xpath("/html/body/footer/ul/li[1]/a")).click();
Thread.sleep(1000);
Actions a = new Actions(driver);
a.sendKeys(Keys.END).build().perform();
Thread.sleep(2000);
driver.findElement(By.className("fa-arrow-up")).click();

	}
	
	@Test(priority= 1)
	@Parameters("browser")
	public void lenovoDropDowndefect(String browser) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",browser);
		WebDriver driver = new EdgeDriver();
		driver.get("https://qualicoach.org/mwapp/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("navbarDropdown")).click();
		driver.findElement(By.linkText("Lenovo")).click();
        Thread.sleep(5000);
        String url=driver.getCurrentUrl();
        Assert.assertEquals(url, "https://mobileworld.banyanpro.com/#len");
        
            Thread.sleep(5000);
         driver.quit();
        
        
        }

}
