package com.selenium.Project1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Browser1edge {
	

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			
			//Browser setup
			WebDriverManager.edgedriver().setup();
			

		    //Chrome driver object
			
			WebDriver driver=new EdgeDriver();
			
			//launching this site in browser
			driver.get("http://google.com");   
			
			//getting title of opened site
			System.out.println(driver.getTitle());
			
			//getting url of current opened website
			System.out.println(driver.getCurrentUrl());
			
			
			//maximixing  browser window
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			driver.get("http://omayo.blogspot.com");
			
			//nevigation command
			driver.navigate().back();
			
			driver.navigate().forward();
			
			driver.navigate().refresh();
			
			//getting page source
			String pageSource=driver.getPageSource();
			System.out.println(pageSource);
			
			//closing currrent tab / if we want to close all tab and window use quit
			driver.close();
			
			
		
			
			
			
		
		}

	}

