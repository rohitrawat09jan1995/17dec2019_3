package git_2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class git_2
{
	WebDriver driver;
  @Test
  public void registration() throws InterruptedException 
  {
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.findElement(By.linkText("SignUp")).click();
	  driver.findElement(By.id("userName")).sendKeys("rohitrawat");
	  driver.findElement(By.id("firstName")).sendKeys("rohit");
	  driver.findElement(By.id("lastName")).sendKeys("rawat");
	  driver.findElement(By.id("password")).sendKeys("password");
	  driver.findElement(By.id("pass_confirmation")).sendKeys("password");
	  driver.findElement(By.id("gender")).click();
	  driver.findElement(By.id("emailAddress")).sendKeys("rohitrawat@gmail.com");
	  driver.findElement(By.id("mobileNumber")).sendKeys("9999592545");
	  driver.findElement(By.id("dob")).sendKeys("09/01/1995");
	  driver.findElement(By.id("address")).sendKeys("111 delhi");
	  driver.findElement(By.cssSelector("select#securityQuestion option:nth-of-type(3)")).click();
	  driver.findElement(By.id("answer")).sendKeys("monkey");
	  driver.findElement(By.name("Submit")).click();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Home")).click();
	  driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.id(   "userName")).sendKeys("rohitrawat");
	  driver.findElement(By.id("password")).sendKeys("password");
	  driver.findElement(By.name("Login")).click();
	  Thread.sleep(3000);
	
	  Actions act=new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'All')]"))).click().perform();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"))).click().perform();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Head Phone')]"))).click().perform();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Add to cart")).click();//driver.findElement(By.cssSelector("a[class='btn btn-success btn-product']")).click();
	  driver.findElement(By.partialLinkText("Cart")).click();//driver.findElement(By.cssSelector("i[class='fa fa-shopping-cart']")).click();
	  driver.findElement(By.cssSelector("a[class='btn btn-success btn-block']")).click();//click checkout
	  driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[contains(text(),'Andhra Bank')]")).click();
	  driver.findElement(By.id("btn")).click();
	  driver.findElement(By.name("username")).sendKeys("123456");
	  driver.findElement(By.name("password")).sendKeys("Pass@456");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
	  driver.findElement(By.xpath("//input[@value='PayNow']")).click();
  }
 
@BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
  	  driver=new ChromeDriver(); 

  }

  @AfterTest
  public void afterTest() {
	 
  }
}