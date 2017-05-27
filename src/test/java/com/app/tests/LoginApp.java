/**
 * 
 */
package com.app.tests;

/**
 * @author rachitdev
 *
 */

import com.app.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginApp {
	
	// Login page class implemented in normal page object pattern style
	
		// Home page class implemented in Page object factory methods
			
		@Test
		public void Login()
		{	
			
			System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		// where you have downloaded the chromedriver the path must be mentioned in the second argument of the above statement.
		WebDriver driver = new ChromeDriver();
		driver.get("https://nightly-reader.realizedev.com");
		LoginPage log = new LoginPage(driver);	
			
			//change the sendkeys section according to the test data.

			log.username().sendKeys("hello");
			log.password().sendKeys("hello");
			log.signin().click();
						
		}

}
