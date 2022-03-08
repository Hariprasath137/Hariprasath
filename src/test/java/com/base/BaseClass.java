package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class BaseClass {
	
	public static WebDriver driver;
	
	public static void browserLaunch(String url) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	}
	
	public static void select(WebElement element) {
		Select s = new Select(element);
	}
	
	public static void quit() {
	driver.quit();
	}
	
	public static void btnclick(WebElement element) {
	 element.click();

	}
	public static void type(WebElement element,String string) {
	element.sendKeys(string);

	}
	public String currenturl() {
	return driver.getCurrentUrl();

	}
	
	
	
	
}
