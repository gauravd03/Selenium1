package com.selenium.Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		//Driversetup
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gdandekar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		
		//browser setup
		co.setBinary("C:\\Users\\gdandekar\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		co.addArguments("---remote-allow-origins=*");

		
	    //Chrome driver object
		
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("http://google.com");
		
		/*
		//two ways to enter button
		
		driver.findElement(By.id("APjFqb")).sendKeys("Google",Keys.ENTER);
		
		//driver.findElement(By.className("gLFyf")).submit();
		
		//switch to new tab and search 
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("Edge",Keys.ENTER);
		
		//storing webElement for simplicity
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://google.com");
		WebElement searchBox=driver.findElement(By.id("APjFqb"));   //hrere storing lonk code in single text searchBox
		
		searchBox.sendKeys("hello");
		
		
		
		//for access text link elements 
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://google.com");
		WebElement gmailLink=driver.findElement(By.linkText("Gmail"));
		//checking element is enabled or not befoere clicking 
		boolean isEnabled=gmailLink.isEnabled();
		System.out.println(isEnabled);
		gmailLink.click();
			
		//Web element commands 
		
	//1.clear()
		
		//searchBox.clear();   //clear the typed text
		
		
	//3.getText().
		
		
	//4.isEnabled()
//		boolean isEnabled=gmailLink.isEnabled();   //tested  in above code 
//		System.out.println(isEnabled);
		
	//5.isDisplayed()
	  	
		
     //7.submit
		
		
	//8.getAttribute()
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://google.com");
		WebElement searchBox1=driver.findElement(By.id("APjFqb"));
		
		String atrributaValue=searchBox1.getAttribute("id");   //here we are getting atribute value and storing in string 
		System.out.println("attribute value ="+atrributaValue);
		
		
		
		//Xpath of serch box gmail
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://google.com");
		WebElement searchBox3=driver.findElement(By.xpath("//*[@id='APjFqb']"));   //here x path 
		searchBox3.sendKeys(" xpath hello");
		
		
		
		*///..............................................................
		
	  //hadnling with printing multiple elements  
		//use driver.fingElemets()  for finding multiple elements   (s attached)   
		 //store them in list and print using for each
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://flipkart.com");
		
		Thread.sleep(3000);
		//CLOSE SINGE IN WINDOW
		driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
		
		WebElement searchboxFlipkart=driver.findElement(By.name("q"));
		searchboxFlipkart.sendKeys("mobile",Keys.ENTER);
		Thread.sleep(3000);
		WebElement samsung=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label/div[1]"));
		
		samsung.click();
		Thread.sleep(2000);
		
		List<WebElement> data=driver.findElements(By.className("_4rR01T"));  //storing all elements in list 
		
		for(WebElement webElement:data) {
			System.out.println(webElement.getText());
		}
		
		//.............................................................................................
		
		//Question practice
		
	}

}
