package com.defenition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;
import com.pojo.PojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefenition extends BaseClass {
	
	@Given("User enters the login page")
	public void user_enters_the_login_page() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.get("https://adactinhotelapp.com/");
	}

	@When("User enters the Valid username and password And clicks login")
	public void user_enters_the_Valid_username_and_password_And_clicks_login() {
	   PojoClass p = new PojoClass();
	   type(p.getUsername(), "digitalindia");
	   type(p.getPassword(), "987654321");
	   btnclick(p.getLoginbtn());
	    
	}

}