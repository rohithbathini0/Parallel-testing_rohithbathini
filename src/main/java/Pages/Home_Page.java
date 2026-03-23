package Pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import wait_utilities.Explicit_Wait;

public class Home_Page extends Explicit_Wait{


   	WebDriver driver;	
	 private By logoutElement = By.xpath("//a[@href='/logout']");
	 By usernameElement = By.xpath("//ul[@class=\"nav navbar-nav\"]//ul[@class=\"nav navbar-nav\"]//a//b");

	public Home_Page(WebDriver driver){

		this.driver = driver;
		Explicit_Wait.wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	}


    public void Click_logout_element() {

		Explicit_Wait.Wait_until_element_to_be_clickable(driver.findElement(logoutElement));
		driver.findElement(logoutElement).click();

	}
    
    public String get_Account_UserName() {
    	
    	// Explicit_Wait.Wait_until_visibilityOfElementLocated(usernameElement);
    	         
    	 String username = driver.findElement(usernameElement).getText();   	 
    	 return username;

	}
    
   
   


}
