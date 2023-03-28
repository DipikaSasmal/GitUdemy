package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsFacebook {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dipika Sasmal\\Desktop\\selenium\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();//syntax for creating web driver//typcast the interface
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		//Absolute x-path
		/*driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]")).sendKeys("T-shirts");
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/button")).click();
		
		//relative x-path
		driver.findElement(By.xpath("//input[@name=\"search_query\"]")).sendKeys("T-shirts");
		driver.findElement(By.xpath("//button[@name=\"submit_search\"]")).click();
		
		//or operator [any one should match]
		driver.findElement(By.xpath("//input[@name='search_query'or @class='search_query']")).sendKeys("T-shirts");
		driver.findElement(By.xpath("//button[@name='submit_search'or @type='submit']")).click();*/
		//and operator [both should match]
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='search_query' and @class='search_query']")).sendKeys("T-shirts");
		driver.findElement(By.xpath("//button[@name='submit_search' and @type='submit']")).click();
		
		
		
		
		
		
		
		
		/*driver.navigate().to("https://www.myntra.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		
		//web driver is an interface
		//chromedriver is a class
		//typecasting ---> convert one data type into another data type*/
	}
	

}
