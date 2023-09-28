package test.org;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Test {

	
	public static void main(String[]args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:google.com/");
		
		WebElement fj = driver.findElement(By.id("APjFqb"));
		
		fj.sendKeys("movies" + Keys.ENTER);
		
		//fj.clear();
		
	//	fj.sendKeys("nature");
		
		driver.findElement(By.id("APjFqb")).clear();
		
		driver.findElement(By.id("APjFqb")).sendKeys("nature");
     
      

		
	
		
		
		
		
		
		
	
   
   
   
   
    
    	

		
		
		
		
		
		

		
		
	}}
