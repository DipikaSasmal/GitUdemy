package org.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VlunterSignup {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dipika Sasmal\\Desktop\\selenium\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();//syntax for creating web driver//typcast the interface
		driver.get("https://www.formsite.com/templates/non-profit/volunteer-signup-form");
		
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/img")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Dipika");
		
		

	}

}
