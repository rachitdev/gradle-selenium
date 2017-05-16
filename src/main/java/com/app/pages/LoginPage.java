/**
 * 
 */
package com.app.pages;

/**
 * @author rachitdev
 *
 */


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	WebDriver driver;
	
	@FindBy(css = "input[id='username']")
	WebElement username;
	
	@FindBy(css = "input[id='password']")
	WebElement password;
	
	@FindBy(css = "input[id='sign_in']")
	WebElement signin;
	

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
					    
	}	
				   
	   public WebElement username()
	   {
		   return username;
	   }
	         
	   public WebElement password()
	   {
		   return password;
	   }
	   
	   public WebElement signin()
	   {
		   return signin();
	   }
	   	   
}
