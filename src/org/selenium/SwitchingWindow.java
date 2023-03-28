package org.selenium;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindow {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dipika Sasmal\\Desktop\\selenium\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[@href=\"#Tabbed\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button")).click();
		System.out.println(driver.getTitle());
		Set<String> S = driver.getWindowHandles();
		for(String i:S) 
		{
			String title = driver.switchTo().window(i).getTitle(); 
			System.out.println(title);
			
			TakesScreenshot src = (TakesScreenshot)driver;
			File source = src.getScreenshotAs(OutputType.FILE);
			File dest = new File(".\\screenshot\\homepage.png");
			FileUtils.copyFile(source,dest);
			 if(title.contains("Frames & windows")) {
				 driver.close();
			 }
			
		}

	}

}
