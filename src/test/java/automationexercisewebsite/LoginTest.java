package automationexercisewebsite;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import Pages.Home_Page;
import Pages.SignUp_LoginPage;
import excel_utilities.Excel_utilities;

public class LoginTest extends BaseTest{
	
	SignUp_LoginPage loginPage;
	Home_Page home_Page;
	Excel_utilities excel_utilities;
	
	@Test(priority = 1)
    public void Valid_credentials_loginTest() throws IOException {
		
	    loginPage = new SignUp_LoginPage(driver);
				
		loginPage.click_signup_Login_Element();
				
		 excel_utilities = new Excel_utilities();
		loginPage.Enter_email(excel_utilities.get_value(excel_utilities.get_Sheet(properties.getProperty("path"),properties.getProperty("sheetname")),1,0));
		loginPage.Enter_Password(excel_utilities.get_value(excel_utilities.get_Sheet(properties.getProperty("path"),properties.getProperty("sheetname")),1,1));
		loginPage.click_Login_Element();	
	    
		 home_Page = new Home_Page(driver); 
		/* String username = home_Page.get_Account_UserName();
		 * 
		 * assertEquals(username, "Rohith Kumar Bathini");
		 */
	    
	    home_Page.Click_logout_element();
	    
	
	}

	
	@Test(priority = 2)
    public void inValid_credentials_loginTest() throws IOException {
		
		//loginPage = new SignUp_LoginPage(driver);
				
		loginPage.click_signup_Login_Element();
		loginPage.Enter_email(excel_utilities.get_value(excel_utilities.get_Sheet(properties.getProperty("path"),properties.getProperty("sheetname")),1,3));
		loginPage.Enter_Password(excel_utilities.get_value(excel_utilities.get_Sheet(properties.getProperty("path"),properties.getProperty("sheetname")),1,4));
		loginPage.click_Login_Element();
		
		
	    assertEquals(loginPage.get_Invalid_credentials_error_message(), "Your email or password is incorrect!");
						
		
	}
	
	

}
