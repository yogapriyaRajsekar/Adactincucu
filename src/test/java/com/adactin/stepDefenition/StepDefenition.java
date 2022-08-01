package com.adactin.stepDefenition;

import org.openqa.selenium.WebDriver;
import com.Cucumber.BaseClass;
import com.Cucumber.PomManager;
import com.adactin.testRunner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefenition extends BaseClass {
	 WebDriver driver = RunnerClass.driver;
	 PomManager pom=new PomManager(driver);
	 
	 @Given("^User Launch The Given Url$")
	 public void user_Launch_The_Given_Url() throws Throwable {
		 get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
	    
	 }
	 
	 @When("^User Enter The Username In The \"([^\"]*)\" Field$")
	 public void user_Enter_The_Username_In_The_Field(String value) throws Throwable {
		 waits(10000);
		 sendKeys(pom.getInstanceFp().getUsername(), value);
	 }

	 @When("^User Enter The PasswordIn The \"([^\"]*)\" Field$")
	 public void user_Enter_The_PasswordIn_The_Field(String value1) throws Throwable {
			sendKeys(pom.getInstanceFp().getPassword(), value1);

	 }
	 
     @Then("^user clicks The Login Button Which Navigates To The Search Hotel Page$")
	 public void user_clicks_The_Login_Button_Which_Navigates_To_The_Search_Hotel_Page() throws Throwable {
 		click(pom.getInstanceFp().getLogin());

     }
     
     @Given("^user Enter The Location In The Location Field$")
     public void user_Enter_The_Location_In_The_Location_Field() throws Throwable {
 		sendKeys(pom.getInstanceSp().getLocation(), "Paris");

     }

     @When("^user Enter The Hotel In The Hotel Field$")
     public void user_Enter_The_Hotel_In_The_Hotel_Field() throws Throwable {
 		sendKeys(pom.getInstanceSp().getHotels(), "Hotel Sunshine");

     }

     @When("^user Select The RoomType In The RoomType Field$")
     public void user_Select_The_RoomType_In_The_RoomType_Field() throws Throwable {
 		sendKeys(pom.getInstanceSp().getRoomType(), "Deluxe");

     }

     @When("^user Select The No Of Rooms In The No Of Rooms Field$")
     public void user_Select_The_No_Of_Rooms_In_The_No_Of_Rooms_Field() throws Throwable {
 		dropDown(pom.getInstanceSp().getNoOfRooms(), "selectbyindex", "1");

     }

     @When("^user Select The AdultRoom In The AdultRoom Field$")
     public void user_Select_The_AdultRoom_In_The_AdultRoom_Field() throws Throwable {
 		sendKeys(pom.getInstanceSp().getAdultRoom(), "1 -One");

     }

     @When("^user Select The ChildRoom In The ChildRoom Field$")
     public void user_Select_The_ChildRoom_In_The_ChildRoom_Field() throws Throwable {
 		dropDown(pom.getInstanceSp().getChildRoom(), "selectByIndex", "2");

     }

     @Then("^user Clicks The Submit Button$")
     public void user_Clicks_The_Submit_Button() throws Throwable {
 		click(pom.getInstanceSp().getSubmit());

     }

     @Given("^user Clicks The RadioButton$")
     public void user_Clicks_The_RadioButton() throws Throwable {
 		click(pom.getInstanceTp().getRadioButton());

     }

     @Then("^user Click The Submit Button$")
     public void user_Click_The_Submit_Button() throws Throwable {
 		click(pom.getInstanceTp().getNext());

     }

     @Given("^user Enter The FirstName In The FirstName Field$")
     public void user_Enter_The_FirstName_In_The_FirstName_Field() throws Throwable {
 		sendKeys(pom.getInstanceAp().getFirstName(), "yogapriya");

     }

     @When("^user Enter The LastName In The LastName Field$")
     public void user_Enter_The_LastName_In_The_LastName_Field() throws Throwable {
 		sendKeys(pom.getInstanceAp().getLastName(), "rameshbabu");

     }

     @When("^user Select The Address In The Address Field$")
     public void user_Select_The_Address_In_The_Address_Field() throws Throwable {
 		sendKeys(pom.getInstanceAp().getAddress(), "no.123,royal street,paris,france");

     }

     @When("^user Select The CardNo In The CardNo Field$")
     public void user_Select_The_CardNo_In_The_CardNo_Field() throws Throwable {
 		sendKeys(pom.getInstanceAp().getCcNum(), "1234567898765432");

     }

     @When("^user Select The CardType In The CardType Field$")
     public void user_Select_The_CardType_In_The_CardType_Field() throws Throwable {
 		sendKeys(pom.getInstanceAp().getCcType(), "VISA");

     }

     @When("^user Select The CardExpiry Month In The CardExpiry Month Field$")
     public void user_Select_The_CardExpiry_Month_In_The_CardExpiry_Month_Field() throws Throwable {
 		sendKeys(pom.getInstanceAp().getCcExpMonth(), "January");

     }

     @When("^And user Select The CardExpiry Year In The CardExpiry Year Field$")
     public void and_user_Select_The_CardExpiry_Year_In_The_CardExpiry_Year_Field() throws Throwable {
 		sendKeys(pom.getInstanceAp().getCcExpYear(), "2027");

     }

     @When("^user Select The CVV In The CVV Field$")
     public void user_Select_The_CVV_In_The_CVV_Field() throws Throwable {
 		sendKeys(pom.getInstanceAp().getCvv(), "123");

     }

     @Then("^user Clicks The Book Button$")
     public void user_Clicks_The_Book_Button() throws Throwable {
 		click(pom.getInstanceAp().getBook());

     }

     @Given("^user Scroll Down$")
     public void user_Scroll_Down() throws Throwable {
 		scrollDown();

     }

     @When("^user Takes Thread Sleep$")
     public void user_Takes_Thread_Sleep() throws Throwable {
 		Thread.sleep(6000);

     }

     @Then("^user Clicks Logout Button$")
     public void user_Clicks_Logout_Button() throws Throwable {
 		click(pom.getInstanceBp().getLogOut());
 }




}
