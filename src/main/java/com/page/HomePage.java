package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage  {
	
	 WebDriver driver;

  @FindBy(id= "ForceCom_font") WebElement home ;
  @FindBy(id ="error") WebElement errorMessage;
  @FindBy(xpath= "//*[@id=\"forgotPassForm\"]/div/p[1]") WebElement resettingmsg;
 
  
  @FindBy(xpath="//*[@id=\"userNavLabel\"]") WebElement userMenu;
  
     public HomePage(WebDriver driver) {
    	 super(driver);
    	 this.driver= driver;
    	 PageFactory.initElements(driver, this);
     }
     
    
      public String getTextFromHomePage() {
        	return home.getText();
      }
        	
      public String getTextFromAlert() {
            return home.getText();	
      }
      
          public String getResettingMessage() {
        	  return driver.findElement((By) resettingmsg).getText();
          }
     
     }

      
