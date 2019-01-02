package com.vijay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
	
		//setting the property for chrome driver
		System.setProperty("webdriver.chrome.driver","/Users/gvijaykumarreddy/Desktop/Learning from Dec 2018/chromedriver");
		//object creation for chromedriver
		WebDriver driver = new ChromeDriver();
		//enters the url and opens it
		driver.get("http://www.google.com");
		//prints the title of the web page
		System.out.println(driver.getTitle());
		//just closes(minimize) the browser and you can see the browser minimized
		driver.close();
		//completely quits the browser and you will not see the browser minimized
		driver.quit();
	}

}
