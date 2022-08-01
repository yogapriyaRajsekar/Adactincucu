package com.Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPageAdatin {
	public static WebDriver driver;
	public SecondPageAdatin(WebDriver abc) {
      SecondPageAdatin.driver=abc;
      PageFactory.initElements(driver, this);
	}

	
    @FindBy(name="location")
    private WebElement location;
    
    @FindBy(name="hotels")
    private WebElement hotels;
    
    @FindBy(name="room_type")
    private WebElement roomType;
    
    @FindBy(name="room_nos")
    private WebElement noOfRooms;
    
    @FindBy(name="adult_room")
    private WebElement adultRoom;
    
    @FindBy(name="child_room")
    private WebElement childRoom;	
    
    public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(name="Submit")
    private WebElement submit;
}


