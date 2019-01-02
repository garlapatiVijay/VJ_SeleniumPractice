package com.vijay;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalendarbyJS {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","/Users/gvijaykumarreddy/Desktop/Learning from Dec 2018/chromedriver");

		WebDriver driver = new ChromeDriver();// launch chrome

		driver.manage().window().maximize(); // maximise the window
		driver.manage().deleteAllCookies();// delete all cookies

		// dynamic wai
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.spicejet.com"); // url to open
		//driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		WebElement date = driver.findElement(By.id("ctl00_mainContent_view_date1"));
		String Dateval = "Sat, Dec 29 2018";
		selectDatebyJS(driver, date, Dateval);
	}

	public static void selectDatebyJS(WebDriver driver, WebElement element, String Dateval) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','" + Dateval + "');", element);
}
}
