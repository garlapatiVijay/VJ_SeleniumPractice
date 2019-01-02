package com.vijay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/Users/gvijaykumarreddy/Desktop/Learning from Dec 2018/chromedriver");

		WebDriver driver = new ChromeDriver();
		
//		WebDriver driver=new HtmlUnitDriver();
		//htmlunitdriver advantages
		//htmlunitdriver is not available from selenium 3.x
		//1. testing happens behind the browser
		//2. very fast
		//3. not suitable for actions  like mouse movement, drag and drop, double click
		//4. Ghost Driver - Headless browser
		//Many ghost drivers available in market like htmlunitdriver(java), phantomJS(java script)

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://www.freecrm.com");

		System.out.println("Before login " + driver.getTitle());

		driver.findElement(By.name("username")).sendKeys("Knowledgebase86");
		driver.findElement(By.name("password")).sendKeys("FreeCRM123$");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

//		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", loginBtn);

		System.out.println("After login " + driver.getTitle());

		driver.close();
		driver.quit();
	}

}
