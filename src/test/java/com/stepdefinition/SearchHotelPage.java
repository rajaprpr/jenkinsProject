package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.lipglobal.LipGlobal;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchHotelPage extends LipGlobal {
	@Given("User is on Search Hotel page")
	public void user_is_on_Search_Hotel_page() {
		
		Assert.assertTrue("Verify user on Search Hotel", getUrl().contains("SearchHotel"));

	}

	@When("User select the details {string} and {string} and {string} and {string}")
	public void user_select_the_details_and_and_and(String loc, String hotel, String roomType, String noOfRoom) {

		WebElement elementLocation = driver.findElement(By.xpath("//select[@id='location']"));
		type(elementLocation, loc);

		WebElement selHotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		type(selHotel, hotel);
		WebElement selRoomType = driver.findElement(By.xpath("//select[@id='room_type']"));
		type(selRoomType, roomType);

		WebElement selNoOfRoom = driver.findElement(By.xpath("//select[@id='room_nos']"));
		type(selNoOfRoom, noOfRoom);

	}

	@When("User enter the date {string} and {string}")
	public void user_enter_the_date_and(String checkIn, String checkOut) {
		WebElement enterCheckIn = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		type(enterCheckIn, checkIn);

		WebElement enterCheckOut = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		type(enterCheckOut, checkOut);
	}

	@When("User select the person details {string} and {string}")
	public void user_select_the_person_details_and(String adult, String children) {
		WebElement selAdult = driver.findElement(By.xpath("//select[@id='adult_room']"));
		type(selAdult, adult);

		WebElement selChildren= driver.findElement(By.xpath("//select[@id='child_room']"));
		type(selChildren, children);
	}

	@Then("User click the Search button")
	public void user_click_the_Search_button() {
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='Submit']"));
		clickButton(searchButton);
	}

}
