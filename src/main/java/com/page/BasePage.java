package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
   

	 protected static WebDriver driver= null;
	 
	 public BasePage(WebDriver driver) {
		this.driver= driver;
    	 PageFactory.initElements(driver, this);
	} 
    	  public void navigateToUrl(String url) {
    	        driver.get(url);
		   	       
    	       
}
	}

