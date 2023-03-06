package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	WebDriver driver;
		
	@BeforeTest
		public void setUp() {
			driver= new ChromeDriver();
		}
		
	@AfterTest
        public void tearDown() {
        	driver.quit();
        }
	}


