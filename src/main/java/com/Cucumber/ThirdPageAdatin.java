package com.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdPageAdatin {
	
	public static WebDriver driver;
	
 public ThirdPageAdatin(WebDriver bcd) {
	 ThirdPageAdatin.driver=bcd;
	 PageFactory.initElements(driver, this);
}
	
	@FindBy(name="radiobutton_0")
	private WebElement radioButton;
	
	@FindBy(name="continue")
    private WebElement next;

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getNext() {
		return next;
	}
}
