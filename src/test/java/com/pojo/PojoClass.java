package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class PojoClass extends BaseClass{
  
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	public WebElement username;
	@FindBy(id="password")
	public WebElement password;
	@FindBy(id="login")
	public WebElement loginbtn;
	
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	
	
	
	
	
}
