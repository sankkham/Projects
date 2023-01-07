package listeners;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGlisteners.class)
public class practic {

	@Test(priority = 1)
	public void verify_with_no_solution() throws InterruptedException {

		// Setup and instantiate Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\com.test\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.replicon.com/free-trial/");

		String expTitle = "Free Trial - Project Time Tracking Solutions | Replicon";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expTitle, actualTitle, "Verification Passed");

		driver.findElement(By.id("email")).sendKeys("sanketsrk10@gmail.com");
		driver.findElement(By.id("full_name")).sendKeys("Sanket Khamkar");
		driver.findElement(By.id("buss_phone")).sendKeys("9819784471");
		driver.findElement(By.id("company_name")).sendKeys("Capgemini");

		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", ele);
		
		String exp = "You must select a solution before proceeding";
	      //identify actual error message
	      WebElement m = driver.findElement(By.xpath("//span[@class='error p_type1']"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      //verify error message with Assertion
	      Assert.assertEquals(exp, act);
		  

		Thread.sleep(1000);
		driver.close();

	}
	
	
	  @Test(priority = 2) 
	  public void verify_with_mobile() throws InterruptedException {
	  
	  // Setup and instantiate Browser
	  System.setProperty("webdriver.chrome.driver",
	  "C:\\Users\\acer\\eclipse-workspace\\com.test\\chromedriver_win32\\chromedriver.exe"
	  );
	  
	  WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
	  
	  driver.get("https://www.replicon.com/free-trial/");
	  
	  
	  driver.findElement(By.id("email")).sendKeys("sanketsrk10@gmail.com");
	  driver.findElement(By.id("full_name")).sendKeys("Sanket Khamkar");
	  driver.findElement(By.id("company_name")).sendKeys("Capgemini");
	  
	  
	  Thread.sleep(1000);
	  
	  List<WebElement> radio = driver.findElements(By.xpath("//input[@name='p_type1' and @type='radio']"));
	  for (int i = 0; i < radio.size(); i++) 
	  { 
	  WebElement local_radio = radio.get(i); String value = local_radio.getAttribute("value");
	  System.out.println("Values from radio buttons are======>>>>>>" + value);
	  
	  if (value.equalsIgnoreCase("time-bill")) {
	  
	  local_radio.click();
	  
	  } }
	  
	  Thread.sleep(1000); 
	  WebElement ele = driver.findElement(By.xpath("//*[@id=\"submit\"]")); 
	  JavascriptExecutor jse = (JavascriptExecutor) driver; jse.executeScript("arguments[0].click()", ele);
	  
	  String exp = "Please provide Phone # and Extension if any";
      //identify actual error message
      WebElement m = driver.findElement(By.xpath("//span[@class='error buss_phone']"));
      String act = m.getText();
      System.out.println("Error message is: "+ act);
      //verify error message with Assertion
      Assert.assertEquals(exp, act);
	  
	  driver.close();
	  
	  }
	  
	  @Test(priority = 3) 
	  public void verify_with_mail() throws InterruptedException {
	  
	  // Setup and instantiate Browser
	  System.setProperty("webdriver.chrome.driver",
	  "C:\\Users\\acer\\eclipse-workspace\\com.test\\chromedriver_win32\\chromedriver.exe"
	  );
	  
	  WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
	  
	  driver.get("https://www.replicon.com/free-trial/");
	  
	  
	  driver.findElement(By.id("full_name")).sendKeys("Sanket Khamkar");
	  driver.findElement(By.id("buss_phone")).sendKeys("9819784471");
	  driver.findElement(By.id("company_name")).sendKeys("Capgemini");
	  
	  
	  Thread.sleep(1000);
	  
	  List<WebElement> radio = driver.findElements(By.xpath("//input[@name='p_type1' and @type='radio']"));
	  for (int i = 0; i < radio.size(); i++) 
	  { WebElement local_radio =
	  radio.get(i); 
	  String value = local_radio.getAttribute("value");
	  System.out.println("Values from radio buttons are======>>>>>>" + value);
	  
	  if (value.equalsIgnoreCase("wm")) {
	  
	  local_radio.click();
	  
	  } }
	  
	  Thread.sleep(1000); 
	  WebElement ele = driver.findElement(By.xpath("//*[@id=\"submit\"]")); 
	  JavascriptExecutor jse = (JavascriptExecutor) driver; jse.executeScript("arguments[0].click()", ele);
	  
	  String exp = "Please provide Your Work E-mail Address";
      //identify actual error message
      WebElement m = driver.findElement(By.xpath("//span[@class='error email']"));
      String act = m.getText();
      System.out.println("Error message is: "+ act);
      //verify error message with Assertion
      Assert.assertEquals(exp, act);
	  
	  driver.close();
	  
	  }
	  
	  @Test(priority = 4) 
	  public void verify_with_fullname() throws InterruptedException {
	  
	  // Setup and instantiate Browser
	  System.setProperty("webdriver.chrome.driver",
	  "C:\\Users\\acer\\eclipse-workspace\\com.test\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
	  
	  driver.get("https://www.replicon.com/free-trial/");
	  
	  
	  driver.findElement(By.id("email")).sendKeys("sanketsrk10@gmail.com");
	  driver.findElement(By.id("buss_phone")).sendKeys("9819784471");
	  driver.findElement(By.id("company_name")).sendKeys("Capgemini");
	  
	  
	  Thread.sleep(1000);
	  
	  List<WebElement> radio = driver.findElements(By.xpath("//input[@name='p_type1' and @type='radio']"));
	  for (int i = 0; i < radio.size(); i++) 
	  {
		  WebElement local_radio = radio.get(i); 
	  String value = local_radio.getAttribute("value");
	  System.out.println("Values from radio buttons are======>>>>>>" + value);
	  
	  if (value.equalsIgnoreCase("wm")) {
	  
	  local_radio.click();
	  
	  } }
	  
	  Thread.sleep(1000); 
	  WebElement ele = driver.findElement(By.xpath("//*[@id=\"submit\"]")); 
	  JavascriptExecutor jse = (JavascriptExecutor) driver; jse.executeScript("arguments[0].click()", ele);
	  
	  String exp = "Please provide Your Full Name";
      //identify actual error message
      WebElement m = driver.findElement(By.xpath("//span[@class='error full_name']"));
      String act = m.getText();
      System.out.println("Error message is: "+ act);
      //verify error message with Assertion
      Assert.assertEquals(exp, act);
	  
	  driver.close();
	  
	  }

	  
	  @Test(priority = 5) 
	  public void verify_with_company() throws InterruptedException {
	  
	  // Setup and instantiate Browser
	  System.setProperty("webdriver.chrome.driver",
	  "C:\\Users\\acer\\eclipse-workspace\\com.test\\chromedriver_win32\\chromedriver.exe"
	  );
	  
	  WebDriver driver = new ChromeDriver(); 
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.replicon.com/free-trial/");
	  
	  
	  driver.findElement(By.id("email")).sendKeys("sanketsrk10@gmail.com");
	  driver.findElement(By.id("full_name")).sendKeys("Sanket Khamkar");
	  driver.findElement(By.id("buss_phone")).sendKeys("9819784471");
	  
	  
	  Thread.sleep(1000);
	  
	  List<WebElement> radio = driver.findElements(By.xpath("//input[@name='p_type1' and @type='radio']"));
	  for (int i = 0; i < radio.size(); i++) 
	  { WebElement local_radio =  radio.get(i); String value = local_radio.getAttribute("value");
	  System.out.println("Values from radio buttons are======>>>>>>" + value);
	  
	  if (value.equalsIgnoreCase("project-time")) {
	  
	  local_radio.click();
	  
	  } }
	  
	  Thread.sleep(1000); 
	  WebElement ele = driver.findElement(By.xpath("//*[@id=\"submit\"]")); JavascriptExecutor jse =
	  (JavascriptExecutor) driver; jse.executeScript("arguments[0].click()", ele);
	  
	  String exp = "Please provide Name of your Business";
      //identify actual error message
      WebElement m = driver.findElement(By.xpath("//span[@class='error com_name']"));
      String act = m.getText();
      System.out.println("Error message is: "+ act);
      //verify error message with Assertion
      Assert.assertEquals(exp, act);
	  
	  driver.close();
	  
	  }
	 
	  @Test(priority = 6)
	  public void verify_with_solution() throws InterruptedException {
	  
	  // Setup and instantiate Browser
	  System.setProperty("webdriver.chrome.driver",
	  "C:\\Users\\acer\\eclipse-workspace\\com.test\\chromedriver_win32\\chromedriver.exe"
	  );
	  
	  WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
	  
	  driver.get("https://www.replicon.com/free-trial/");
	  
	  String expTitle = "Free Trial - Project Time Tracking Solutions | Replicon";
	  String actualTitle = driver.getTitle(); 
	  Assert.assertEquals(expTitle,
	  actualTitle, "Verification Passed");
	  
	  driver.findElement(By.id("email")).sendKeys("sanketsrk10@gmail.com");
	  driver.findElement(By.id("full_name")).sendKeys("Sanket Khamkar");
	  driver.findElement(By.id("buss_phone")).sendKeys("9819784471");
	  driver.findElement(By.id("company_name")).sendKeys("Capgemini");
	  
	  Thread.sleep(1000);
	  
	  List<WebElement> radio = driver.findElements(By.xpath("//input[@name='p_type1' and @type='radio']"));
	  for (int i = 0; i < radio.size(); i++) 
	  { WebElement local_radio = radio.get(i); 
	  String value = local_radio.getAttribute("value");
	  System.out.println("Values from radio buttons are======>>>>>>" + value);
	  
	  if (value.equalsIgnoreCase("project-time")) {
	  
	  local_radio.click();
	  
	  } }
	  
	  Thread.sleep(1000); 
	  
	  WebElement ele = driver.findElement(By.xpath("//*[@id=\"submit\"]")); 
	  JavascriptExecutor jse = (JavascriptExecutor) driver; jse.executeScript("arguments[0].click()", ele);
	  
	  Thread.sleep(1000); 
	  driver.quit();
	  
	  }
	 

	}

