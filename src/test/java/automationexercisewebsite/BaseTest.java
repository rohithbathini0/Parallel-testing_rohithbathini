package automationexercisewebsite;



import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import wait_utilities.Explicit_Wait;

public class BaseTest extends Explicit_Wait{
	 static WebDriver driver;
	 Properties properties;
	 FileReader fileReader;
	 File propertiesFile;
	
	
	@BeforeSuite
	public void setUp() throws IOException {
		
	    propertiesFile = new File(System.getProperty("user.dir")+"/src/test/resources/basic_data/config.properties");
		fileReader = new FileReader(propertiesFile);
		properties = new Properties();
		properties.load(fileReader);
		
		
		  ChromeOptions options = new ChromeOptions();
		 // options.addArguments("--headless");
		  options.addArguments("--window-size=1920,1080");
		 
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
		driver.get(properties.getProperty("url"));
		
		}
	
  
	
	
	
	@AfterSuite
	public void tearDown() {
	driver.quit();
	}
		
}
