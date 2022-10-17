package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class all {
	WebDriver driver;
public all(WebDriver driver)
	{
		// TODO Auto-generated method stub
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
@FindBy(css="button[type='submit']")
WebElement button;
@FindBy(id="username")
WebElement usernameele;

  @FindBy(id="password")
  WebElement passwordele;
  @FindBy(linkText="Log In")
  WebElement submit;
  @FindBy(id="home")
  WebElement text;
  WebElement Home;
  
  
  public void sign(String username,String password) throws InterruptedException {	  
  button.click();
  delay();
    usernameele.sendKeys(username);
    delay();
    passwordele.sendKeys(password);
    delay();
    submit.click();
    
    text.getText();
    quit();   
  }
 
  public void quit() {
	// TODO Auto-generated method stub
	driver.quit();
}
@FindBy(id="home")
  WebElement home1;
  @FindBy(id="navbarDropdown")
  WebElement latest;
  @FindBy(partialLinkText="Samsung")
  WebElement samsung;
  @FindBy(partialLinkText="More Details")
  WebElement MoreDetails;
  
  @FindBy(className="nav-link")
  WebElement buy;
  
  @FindBy(partialLinkText="Lenovo")
  WebElement Lenovo;
  
  @FindBy(partialLinkText="Apple")
  WebElement Apple;
  
  @FindBy(xpath="//a[@id='navbarDropdown'][contains(.,'Support')]")
  WebElement support;
  
  @FindBy(linkText="Order")
  WebElement Order;
  
  @FindBy(partialLinkText="Contact Us")
  WebElement contactus;
  
  @FindBy(xpath="/html/body/footer/ul/li[1]/a")
  WebElement footerhome;
  
  public void home() throws InterruptedException {
  System.out.println(home1.getText());
  latest.click();
  delay();
  samsung.click();
  MoreDetails.click();
  delay();
  buy.click();
  latest.click();
  Apple.click();
  delay();
  buy.click();
  support.click();
  delay();
  Order.click();
  Set<String> windowHandles=driver.getWindowHandles();
  List<String> windowHandlesList = new ArrayList<>(windowHandles);
  System.out.println(driver.getWindowHandle());
 
  System.out.println(driver.getWindowHandle());
  System.out.println("Total window number" + windowHandlesList.size() +"\n");
  //driver.switchTo().window(windowHandlesList.get(1));
  home1.click();
  support.click();
  delay();
  contactus.click();
  footerhome.click();
  delay();
  quit();
  }
public void delay() throws InterruptedException {
	// TODO Auto-generated method stub
	Thread.sleep(1000);
}

@FindBy(css="button.btn.btn-warning.my-2.my-sm-0")
WebElement Signin;

@FindBy(linkText="Sign up")
WebElement Signup;

@FindBy(css="input[type='text']")
WebElement firstname;

@FindBy(xpath="//input[@placeholder='Last Name']")
WebElement Lastname;

@FindBy(xpath="//input[@placeholder='Enter Email']")
WebElement email;
 
@FindBy(xpath="//input[@type='Password']")
WebElement password;
 
@FindBy(xpath="//input[@type='date']")
WebElement date;
 
@FindBy(xpath="//input[@type='radio']")
WebElement male;

@FindBy(xpath="//input[@placeholder='91XXXXXXXXXX']")
WebElement mobile;

@FindBy(xpath="//textarea[@rows='3']")
WebElement shortbio;

@FindBy (css="button.btn.btn-info.form-control")
WebElement Register;


@FindBy(xpath="//button[normalize-space()='Sign In']")
WebElement regsignin;


@BeforeTest
public void Sign_up(String fname,String lname,String mail,String uppwd,String dob,String gender,String phone,String bio) throws InterruptedException
{
	String gen="male";
	button.click();
	Signup.click();
	delay();
	firstname.sendKeys(fname);
	Lastname.sendKeys(lname);
	delay();
	email.sendKeys(mail);
	password.sendKeys(uppwd);
	date.sendKeys(dob);
	System.out.println(gen.equalsIgnoreCase(gender));
	if(gen.equalsIgnoreCase(gender))
		male.click();
	
	mobile.sendKeys(phone);
	delay();
	shortbio.sendKeys(bio);
	Register.click();
	alert();
	delay();
	regsignin.click();
	//driver.switchTo().alert().accept();

	//alert();
	
	//alert();
	quit();
}
public void alert() {
	// TODO Auto-generated method stub
	driver.switchTo().alert().accept();
}
	public void checkequals() {
}


public void delay1() throws InterruptedException {
	Thread.sleep(2000);
	
	
}
}
