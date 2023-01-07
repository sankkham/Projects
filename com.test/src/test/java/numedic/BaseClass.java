package numedic;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {

	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	
	
	@Test
	@BeforeTest
	public void setup() throws IOException {
		
		if (driver==null) {
			FileReader fr = new FileReader("C:\\Users\\acer\\eclipse-workspace\\com.test\\src\\test\\resources\\configfiles\\config.properties");
			prop.load(fr);
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("testurl"));
			
		}
		
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("testurl"));
		}
		
	
	}
	
	
	  @AfterTest public void closebrowser() {
	  
	  driver.quit(); 
	  System.out.println("Teardown Succssfull");
	  
	  }
	 
}

