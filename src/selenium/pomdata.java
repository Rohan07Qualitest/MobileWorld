package selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class pomdata {
	

@Test(dataProvider="regi_Data")
public void Sign_up(String fname,String lname,String email,String password,String dob,String gender,String mobile,String bio) throws InterruptedException {
    
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rohan.baisa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://qualicoach.org/mwapp/index.html");   
    driver.manage().window().maximize();
    all open=new all(driver);
    open.Sign_up(fname,lname,email,password,dob,gender,mobile,bio);
    
}
@Test(dataProvider="getData")
public void signin(String username,String password) throws InterruptedException {
    
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rohan.baisa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://qualicoach.org/mwapp/index.html");
    driver.manage().window().maximize();
    all open=new all(driver);
    open.sign(username,password);
    
    driver.quit();
}    
@AfterTest
public void home() throws InterruptedException {
    
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rohan.baisa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://qualicoach.org/mwapp/index.html");
    driver.manage().window().maximize();
    all open=new all(driver);
    open.home();
    
            
}
@DataProvider
public Object[][] getData(){
    Object[][] data=new Object[3][2];
    data[0][0]="Rohan";
    data[0][1]="Rohan@123";
    data[1][0]="Chotu";
    data[1][1]="chotu@123";
    data[2][0]="kiran";
    data[2][1]="kiran@123";
    return data;
    
}
@DataProvider
public Object[][] regi_Data(){
    Object[][] rg=new Object[2][8];
    rg[0][0]="Rohan";
    rg[0][1]="Baisa";
    rg[0][2]="br@gmail.com";
    rg[0][3]="rohan@123";
    rg[0][4]="18/05/2000";
    rg[0][5]="male";
    rg[0][6]="7732054722";
    rg[0][7]="Welcome";
    rg[1][0]="chandu";
    rg[1][1]="S";
    rg[1][2]="chandu@gmail.com";
    rg[1][3]="chandu@123";
    rg[1][4]="16/10/2000";
    rg[1][5]="male";
    rg[1][6]="9895372365";
    rg[1][7]="Hello I am chandu";
    return rg;
    
}


}
