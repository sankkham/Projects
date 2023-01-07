package numedic;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGlisteners.class)
public class qa extends BaseClass{


	@Test(priority = 1)
	public void verify_headingText() throws InterruptedException {


		String expectedHeading = "JOIN OUR CREW";
		//Storing the text of the heading in a string
    	String heading = driver.findElement(By.xpath("//div[@class='page-header']//h1")).getText();
    	if(expectedHeading.equalsIgnoreCase(heading))
          	System.out.println("The expected heading is same as actual heading --- "+heading);
    	else
          	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
    	
		
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0,1000)"); 
		 
	
    	
    	
    	Thread.sleep(1000);
	
		
	}
        	
	@Test(priority = 2)
	public void verify_dropdown() throws InterruptedException{

		// Setup and instantiate Browser

		WebElement ddrop = driver.findElement(By.id("job_type"));
		Select select = new Select(ddrop);
		select.selectByValue("IN");
		String expectedMsg = "There are no available job positions that match your filters.";
		//Storing the text of the heading in a string
    	String message = driver.findElement(By.xpath("//*[@id='job-posts-table']")).getText();
    	if(expectedMsg.equalsIgnoreCase(message))
          	System.out.println("The expected warning is same as actual message --- "+message);
    	else
          	System.out.println("The expected warning doesn't match the actual message --- "+message);
    	
    	select.selectByValue("FT");
    	WebElement qa = driver.findElement(By.linkText("QA Engineer"));
    	qa.click();
    	
    	Thread.sleep(1000);
    	

		String expectedURL = "https://numadic.com/careers/qa-engineer.php";
		//Storing the text of the heading in a string
		String expURL = driver.getCurrentUrl();
    	if(expectedURL.equalsIgnoreCase(expURL))
          	System.out.println("The expected heading is same as actual heading --- "+expURL);
    	else
          	System.out.println("The expected heading doesn't match the actual heading --- "+expURL);
	
    	WebElement ele = driver.findElement(By.xpath("/html/body/section/div/div[2]/div/a"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", ele);
    	
		Thread.sleep(1000);
		
	
		WebElement ele2 = driver.findElement(By.xpath("//*[@id='job-posts-table']/tbody/tr[10]/td[2]/a"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele2);
		Actions builder = new Actions(driver);   
		builder.moveToElement(ele2, 61, 34).click().build().perform();
		
		
		// Personal Details
		
		driver.findElement(By.id("firstName")).sendKeys("sanket");
		driver.findElement(By.id("lastName")).sendKeys("Khamkar");
		driver.findElement(By.id("email")).sendKeys("sank@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("951224431");
		driver.findElement(By.id("current_city")).sendKeys("Mumbai");
		driver.findElement(By.id("hometown")).sendKeys("Goregaon");
		driver.findElement(By.id("dob")).sendKeys("10/10/1995");
		
		WebElement ddrop1 = driver.findElement(By.id("sports"));
		Select select1 = new Select(ddrop1);
		
		Thread.sleep(5000);
		WebElement first = select1.getFirstSelectedOption();
		System.out.println(first.getText());
		
		WebElement ddrop2 = driver.findElement(By.id("pets"));
		Select select2 = new Select(ddrop2);
		
		Thread.sleep(5000);
		select2.selectByValue("Pokemon");
		
		
		// Academic Details
		
		WebElement ddrop3 = driver.findElement(By.id("graduation_degree"));
		Select select3 = new Select(ddrop3);
		
		Thread.sleep(5000);
		WebElement first2 = select3.getFirstSelectedOption();
		System.out.println(first2.getText());
		
		driver.findElement(By.id("postgraduation_specialization")).sendKeys("Computer");
		driver.findElement(By.id("postgraduation_college")).sendKeys("DY Patil");
		driver.findElement(By.id("postgraduation_percentage")).sendKeys("60");
		
		// Post Graduation
		
		WebElement ddrop4 = driver.findElement(By.id("postgraduation_degree"));
		Select select4 = new Select(ddrop4);
		
		Thread.sleep(5000);
		select4.selectByValue("Msc");
		
		driver.findElement(By.id("postgraduation_specialization")).sendKeys("Computer");
		driver.findElement(By.id("postgraduation_college")).sendKeys("DY Patil");
		driver.findElement(By.id("postgraduation_percentage")).sendKeys("60");
		
		WebElement ele4 = driver.findElement(By.id("careers_form_btn_step1"));
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].click()", ele4);
		
	}

	

	}



