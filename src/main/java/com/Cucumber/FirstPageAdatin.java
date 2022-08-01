package com.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPageAdatin {
	
	public static WebDriver driver;
	
	public FirstPageAdatin(WebDriver div) {
     FirstPageAdatin.driver=div;
     PageFactory.initElements(driver, this);
     
	}
	
	@FindBy(name="username")
	
	private WebElement username;

	
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	

}
