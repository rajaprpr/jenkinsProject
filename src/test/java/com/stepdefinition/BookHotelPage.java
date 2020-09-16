package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.lipglobal.LipGlobal;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookHotelPage extends LipGlobal {
	@Given("User is on Hotel Booking page")
	public void user_is_on_Hotel_Booking_page() {
	    
	}

	@When("User Enter the {string} and {string} and {string}")
	public void user_Enter_the_and_and(String firstName, String lastName, String address) {
	 WebElement firstNameText = driver.findElement(By.xpath("//input[@id='first_name']"));
	 type(firstNameText, firstName);
	 getAttributeValue(firstNameText);
	 
	 WebElement lastNameText = driver.findElement(By.xpath("//input[@id='last_name']"));
	 type(lastNameText, lastName);
	 
	 WebElement addressText = driver.findElement(By.xpath("//textarea[@id='address']"));
	 type(addressText, address);
	 
	 
	}

	@When("User Enter the Creditcard details")
	public void user_Enter_the_Creditcard_details(io.cucumber.datatable.DataTable data) {
	    List<Map<String, String>> card = data.asMaps();
	    
	    Map<String, String> m1 = card.get(0);
		
	    String cardNo = m1.get("CreditCardNo");
	    WebElement cc_Num = driver.findElement(By.xpath("//input[@id='cc_num']"));
	    type(cc_Num, cardNo);
	    
		String cardType = m1.get("CardType");
	    WebElement cc_Type = driver.findElement(By.xpath("//select[@id='cc_type']"));
	    type(cc_Type, cardType);
	    
		String expMonth = m1.get("Exp_Month");
	    WebElement cc_Month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
	    type(cc_Month, expMonth);
	    
		String expYear = m1.get("Exp_Year");
	    WebElement cc_Year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	    type(cc_Year, expYear);
	    
		String cvvNO = m1.get("CVV");
		System.out.println(cvvNO);
	    WebElement cvv_number = driver.findElement(By.xpath("//*[@id='cc_cvv']"));
	    type(cvv_number, cvvNO);
	    
		
	}

	@Then("User should click the BookNow button")
	public void user_should_click_the_BookNow_button() throws InterruptedException {
	 WebElement bookNowbtn = driver.findElement(By.xpath("//input[@id='book_now']"));
	 clickButton(bookNowbtn);
	 
	 Thread.sleep(5000);
	 scrollDownPage();
	 
	 Thread.sleep(5000);
	 WebElement orderId = driver.findElement(By.xpath("//*[@id='order_no']"));
	 String orderIdValue = orderId.getAttribute("value");
	 System.out.println(orderIdValue);
	 System.out.println("Booking Success");
	 
	 driver.quit();
	}

	
}
