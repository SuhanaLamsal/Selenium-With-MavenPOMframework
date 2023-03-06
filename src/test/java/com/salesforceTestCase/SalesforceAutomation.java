package com.salesforceTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.page.HomePage;
import com.page.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceAutomation {
	
	@Test
	public void password_field() throws InterruptedException {
		String expected= "Please enter your password.";
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		Thread.sleep(4000);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername("suhana7@tekarch.com");
		loginpage.clear();
		driver=loginpage.clickLogin();
		Thread.sleep(3000);
		
		String actual = driver.findElement(By.id("error")).getText();
		Assert.assertEquals(actual, expected);
		driver.close();
	}
	
	@Test
	public void Login_Script() throws InterruptedException {
		String expected= "Home";
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		Thread.sleep(4000);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername("suhana7@tekarch.com");
		loginpage.enterPassword("United@0304");
		driver=loginpage.clickLogin();
		Thread.sleep(3000);
		
		HomePage homepage= new HomePage(driver);
	    String actual= homepage.getTextFromHomePage();
	    Assert.assertEquals(expected, actual);
	    driver.close();
		
	}
		
		@Test
		public void testlogin() throws InterruptedException {
			String expectedName= "suhana7@tekarch.com";
			WebDriver driver;
			
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://login.salesforce.com");
			Thread.sleep(4000);
			LoginPage loginpage = new LoginPage(driver);
			loginpage.enterUsername("suhana7@tekarch.com");
			loginpage.enterPassword("United@0304");
			Thread.sleep(3000);
			loginpage.clickrememberMe("rememberUn");
			driver=loginpage.clickLogin();
			Thread.sleep(3000);
			WebElement userMenuDropdown= driver.findElement(By.id("userNavLabel"));
			userMenuDropdown.click();
			Thread.sleep(3000);
			loginpage.clicklogOut();	
	
	/*
			WebElement Username= driver.findElement(By.id("username"));
			String actualName= Username.getText();
			if(actualName.equalsIgnoreCase(expectedName)) {
				System.out.println("The script test passed");
			}
			else {
				System.out.println("The script test failed");	  */
			}
		
		
			@Test
			public void Forgot_password() throws InterruptedException {
				String expected = "We’ve sent you an email with a link to finish resetting your password.";
				WebDriver driver; 
				
				WebDriverManager.chromedriver().setup();
			    driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://login.salesforce.com");
				Thread.sleep(4000);
				LoginPage loginpage = new LoginPage(driver);
			    loginpage.forgotpassword();
			    Thread.sleep(2000);
				loginpage.enterfName();
				Thread.sleep(2000);
				loginpage.clickContinueButton();
			
		/*		
				HomePage homepage= new HomePage(driver);
				String actual= homepage.getResettingMessage();
				Assert.assertEquals(expected, actual);
			    driver.close();      */
        }
			
			@Test
			public void Loginerror_Script() throws InterruptedException {
				String expected= "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
				WebDriver driver;
				
				WebDriverManager.chromedriver().setup();
			    driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://login.salesforce.com");
				Thread.sleep(4000);
				LoginPage loginpage = new LoginPage(driver);
				loginpage.enterUsername("123");
				loginpage.enterPassword("22131");
				driver=loginpage.clickLogin();
				Thread.sleep(3000);
				
				String actual = driver.findElement(By.id("error")).getText();
				Assert.assertEquals(actual, expected);
				driver.close();
	}		
			
			@Test
			public void testcase_5() throws InterruptedException {
				String expected= "My Profile"
					;
				WebDriver driver;
				
				WebDriverManager.chromedriver().setup();
			    driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://login.salesforce.com");
				Thread.sleep(4000);
				LoginPage loginpage = new LoginPage(driver);
				loginpage.enterUsername("suhana7@tekarch.com");
				loginpage.enterPassword("United@0304");
				Thread.sleep(3000);
				driver=loginpage.clickLogin();
				WebElement userMenuDropdown= driver.findElement(By.id("userNavLabel"));
				userMenuDropdown.click();
				
				String actual = driver.findElement(By.xpath("//a[text()='My Profile']")).getText();
				Assert.assertEquals(actual, expected);
				driver.close();
				
				
			}		
}
