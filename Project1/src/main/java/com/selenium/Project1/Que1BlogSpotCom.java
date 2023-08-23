package com.selenium.Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Que1BlogSpotCom {
	public static void main(String [] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gdandekar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		
		//browser setup
		co.setBinary("C:\\Users\\gdandekar\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		co.addArguments("---remote-allow-origins=*");

	
	    //Chrome driver object	
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		
		WebElement E =driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[1]"));
		boolean result1=E.isEnabled();
		System.out.println(result1);
		
		boolean result2=E.isSelected();
		System.out.println(result2);
		
		
		//clicking on radio buttons
		WebElement orangeCheck=driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[4]"));
		orangeCheck.click();
		
		WebElement greenCheck=driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[5]"));
		greenCheck.click();
		
		WebElement purpleCheck=driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[6]"));
		purpleCheck.click();
		//.............................
		
		
		//checking is internet explorer selected  or not 
		
		WebElement internetExpleorer=driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[1]"));
		boolean result4=internetExpleorer.isSelected();
		System.out.println("internet explorer is selected or not   : "+result4);
		
		//check opera selected or not
		WebElement operaButton=driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[3]"));
		boolean result5=operaButton.isSelected();
		System.out.println("opera is selected or not   : "+result5);
		
		
		
		
		
		
	}

}
