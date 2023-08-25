package com.selenium.Project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task2ExplicitlyWait25thAug {
public static void main(String [] args) throws InterruptedException {
	
	        //Driversetup
			System.setProperty("webdriver.chrome.driver","C:\\Users\\gdandekar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions co=new ChromeOptions();
			
			//browser setup
			co.setBinary("C:\\Users\\gdandekar\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
			co.addArguments("---remote-allow-origins=*");

			
		    //Chrome driver object
			
			WebDriver driver=new ChromeDriver(co);
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			driver.manage().window().maximize();

        // Usinf Explicitly wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

 
        //Login
        wait.until(ExpectedConditions.elementToBeClickable(By.name("username"))).sendKeys("Admin");
       
        
        wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("admin123");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span"))).click();
     
        //Searching for admin details
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"))).sendKeys("Admin");
       
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"))).click();
      
    
        //Logging out
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img"))).click();
     
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout"))).click();

        
        
    }
}
