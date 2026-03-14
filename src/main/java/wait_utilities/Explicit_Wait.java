package wait_utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {
	
public static WebDriverWait wait ;
 
 
  public static void Wait_until_element_to_be_clickable(WebElement element){
	 
	  wait.until(ExpectedConditions.elementToBeClickable(element));
	  
 }
 
  public static void Wait_until_Presence_of_element_located(By element){
		 
	  wait.until(ExpectedConditions.presenceOfElementLocated(element));
	  
 }
	
  public static void Wait_until_visibilityOfElementLocated(By element){
		 
	  wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	  
 }
  
  
  public static void Wait_until_textToBePresentInElementLocated(By element, String text){
		 
	  wait.until(ExpectedConditions.textToBePresentInElementLocated(element, text));
	  
 }
  

}
 