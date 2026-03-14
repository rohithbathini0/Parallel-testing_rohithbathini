package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import wait_utilities.Explicit_Wait;

public class SignUp_LoginPage extends Explicit_Wait{
	
	WebDriver driver;
	
	public SignUp_LoginPage(WebDriver driver){
		
		this.driver = driver;
		Explicit_Wait.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		
		
	}
	
    private By signup_Login_Element= By.xpath("//*[text()=' Signup / Login']");
	
    private	By login_emailElement = By.xpath("//div[@class=\'login-form\']//input[@placeholder=\'Email Address\']");

    private	By login_passwordElement = By.xpath("//div[@class=\'login-form\']//input[@placeholder=\'Password\']");
	
    private	By loginButtonElement =By.xpath("//div[@class='login-form']//*[text()='Login']");
    
    private	By Invalid_credentials_error=By.xpath("//p[text()=\'Your email or password is incorrect!\']");
	

	
	public void click_signup_Login_Element() {
		
		  WebElement signup_Login_webElement= driver.findElement(signup_Login_Element);
		  Explicit_Wait.Wait_until_element_to_be_clickable(signup_Login_webElement);
		  signup_Login_webElement.click();
		  
		
	}
	
	  
	 public void Enter_email(String email) {
		 
		 WebElement login_emailwebElement = driver.findElement(login_emailElement);
		 Explicit_Wait.Wait_until_Presence_of_element_located(login_emailElement);
		 login_emailwebElement.sendKeys(email);    	  

     }
	 
     public void Enter_Password(String password) {
		 
    	 WebElement login_passwordweblement =  driver.findElement(login_passwordElement);
    	 Explicit_Wait.Wait_until_Presence_of_element_located(login_passwordElement);
		 login_passwordweblement.sendKeys(password);    	  

     }
	 
     public void click_Login_Element() {
 		
    	  WebElement loginButtonwebElement = driver.findElement(loginButtonElement);
		  Explicit_Wait.Wait_until_element_to_be_clickable(loginButtonwebElement);
		  loginButtonwebElement.click();
		  
		
	}
     
     public String get_Invalid_credentials_error_message() {
  	
      Explicit_Wait.Wait_until_Presence_of_element_located(Invalid_credentials_error);
   	  String Invalid_credentials_error_message = driver.findElement(Invalid_credentials_error).getText();
	  return Invalid_credentials_error_message;
		
	}
	
	

}
