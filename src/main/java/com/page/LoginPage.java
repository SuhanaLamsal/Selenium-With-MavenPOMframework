package com.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	WebDriver driver;
	

	@FindBy(xpath= "//*[@id=\"username\"]") WebElement username;
	@FindBy(id="password") WebElement password;
	@FindBy(id ="error") WebElement errorMessage;
	@FindBy(name="Login") WebElement loginButton;
	@FindBy(id="rememberUn")WebElement rememberMe;
	@FindBy(id="forgot_password_link") WebElement forgotPassword;
	@FindBy(xpath="//*[@id=\"un\"]") WebElement Fname;
	@FindBy(id="continue") WebElement continueButton;
	@FindBy(xpath="//*[@id=\"error\"]") WebElement actualTest;
	@FindBy(id="userNavLabel") WebElement userMenu;
	@FindBy(xpath="//*[@id=\"userNav-menuItems\"]/a[5]") WebElement logOut;
	@FindBy(id ="error") WebElement ErrorMessage;
	
	

     public LoginPage(WebDriver driver) {
    	  super(driver);
    	 this.driver= driver;
    	 PageFactory.initElements(driver, this);
     }
     
     public void enterUsername(String data) {
    	 username.sendKeys(data);
     }
     
     public void enterPassword(String data) {
    	 password.sendKeys(data);
     }	 
      public WebDriver clickLogin() {
        	 loginButton.click(); 
        	 return driver;
   }
      public void clickrememberMe(String data) {
    	  rememberMe.click();
      }
      public WebElement getErrorMessage() {
		return errorMessage;	  
      }
      public WebDriver forgotpassword() {
    	  forgotPassword.click();
		return driver;
      }
     	 
      public void enterfName() {
		 Fname.sendKeys("suhana7@tekarch.com");	 
		// return driver;
		
      }
      public WebDriver clickContinueButton() {
		 continueButton.click();
		 return driver;
      }
      public WebElement getActualTest() {
		return actualTest;
      }
      public void userNav(String data) {
    	  userMenu.click();
      }
      public WebDriver clicklogOut() {
    	  logOut.click(); 
     	 return driver;
    	  
      }
            
      public String getTextFromAlert() {
    	Alert alert=  driver.switchTo().alert();
    	  return alert.getText();
      }

	public void clickRememberMe(String string) {
		// TODO Auto-generated method stub
		
	}

	public void clickUserMenu(String string) {
		// TODO Auto-generated method stub
		
	}

	public void enterfName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

    	}

		
	
       

    