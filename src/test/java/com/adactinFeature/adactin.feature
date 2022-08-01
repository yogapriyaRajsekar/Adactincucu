Feature: Hotel Booking Application

Scenario: Login Page

Given User Launch The Given Url 
When User Enter The Username In The "Yogapriya27" Field
And User Enter The PasswordIn The "yogapriya" Field
Then user clicks The Login Button Which Navigates To The Search Hotel Page

Scenario: Second Page

Given user Enter The Location In The Location Field
When user Enter The Hotel In The Hotel Field
And user Select The RoomType In The RoomType Field
And user Select The No Of Rooms In The No Of Rooms Field
And user Select The AdultRoom In The AdultRoom Field
And user Select The ChildRoom In The ChildRoom Field 
Then user Clicks The Submit Button

Scenario: Third Page

Given user Clicks The RadioButton
Then user Click The Submit Button

Scenario: Fourth Page

Given user Enter The FirstName In The FirstName Field
When user Enter The LastName In The LastName Field
And user Select The Address In The Address Field
And user Select The CardNo In The CardNo Field
And user Select The CardType In The CardType Field
And user Select The CardExpiry Month In The CardExpiry Month Field
And And user Select The CardExpiry Year In The CardExpiry Year Field
And user Select The CVV In The CVV Field
Then user Clicks The Book Button

Scenario: Fifth Page
    Given user Scroll Down
    When user Takes Thread Sleep
    Then user Clicks Logout Button  