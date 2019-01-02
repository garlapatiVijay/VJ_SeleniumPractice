package com.vijay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_DropDown_Handling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/gvijaykumarreddy/Desktop/Learning from Dec 2018/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("divpaxinfo")).click();
		int i=10;
		//adding of 8 adults to the booking
		for(i=1;i<9;i++)
		{	
		driver.findElement(By.id("hrefIncAdt")).click();
		}
	
		driver.quit();
		/*Select s=new Select(driver.findElement(By.id("divpaxinfo")));
		s.selectByIndex(index);
		s.selectByValue(arg0);
		s.selectByVisibleText(arg0);
		s.deselectAll();
		s.deselectByValue(arg0);
		s.deselectByIndex(index);
		s.deselectByIndex(index);*/
	}

}
