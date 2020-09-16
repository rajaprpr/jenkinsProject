package com.stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.lipglobal.LipGlobal;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectHotel extends LipGlobal{
	@Given("User is on Select Hotel page")
	public void user_is_on_Select_Hotel_page() {
	    
		
	}

	@When("User should select the Hotel")
	public void user_should_select_the_Hotel() {
		WebElement selHotelRadio = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		clickButton(selHotelRadio);
	}

	@Then("User should click the continue button")
	public void user_should_click_the_continue_button() {
		WebElement clickContinue = driver.findElement(By.xpath("//input[@id='continue']"));
		clickButton(clickContinue);
	}
}	
