package com.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForthPageAdatin {
	
	public static WebDriver driver;

	
	public ForthPageAdatin(WebDriver cde) {
		ForthPageAdatin.driver = cde;
		PageFactory.initElements(driver, this);
		}

	@FindBy(name="first_name")
	private WebElement firstName;
	
	@FindBy(name="last_name")
	private WebElement lastName	;
	
	@FindBy(name="address")
	private WebElement address	;
	
	@FindBy(name="cc_num")
	private WebElement ccNum	;
	
	@FindBy(name="cc_type")
	private WebElement ccType	;
	
	@FindBy(name="cc_exp_month")
	private WebElement ccExpMonth	;
	
	@FindBy(name="cc_exp_year")
	private WebElement ccExpYear	;
	
	@FindBy(name="cc_cvv")
	private WebElement Cvv	;
	
	@FindBy(name="book_now")
	private WebElement book	;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcExpMonth() {
		return ccExpMonth;
	}

	public WebElement getCcExpYear() {
		return ccExpYear;
	}

	public WebElement getCvv() {
		return Cvv;
	}

	public WebElement getBook() {
		return book;
	}
	
	
	
	
	

}
