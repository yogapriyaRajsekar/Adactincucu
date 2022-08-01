package com.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FifthPageAdatin {
	public static WebDriver driver;
	
	@FindBy(id="logout")
			private WebElement logOut;

	public FifthPageAdatin(WebDriver def) {
     FifthPageAdatin.driver=def;
     PageFactory.initElements(driver, this);
}

	public WebElement getLogOut() {
		return logOut;
	}

}
