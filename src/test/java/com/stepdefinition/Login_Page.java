package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.lipglobal.LipGlobal;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_Page extends LipGlobal {

@Given("User is on Login page")
public void user_is_on_Login_page() {
	getDriver();
	loadUrl("http://adactinhotelapp.com/");   
}

@When("User enter the {string} and {string}")
public void user_enter_the_and(String txt, String pass) {
   WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
   type(userName, txt);
   Assert.assertEquals("Verify Username", txt, getAttributeValue(userName));
   
   WebElement passText = driver.findElement(By.xpath("//input[@id='password']"));
   type(passText, pass);
   Assert.assertEquals("verify Password", pass, getAttributeValue(passText));
}

@Then("User should click the login button")
public void user_should_click_the_login_button() {
    WebElement btnLogin = driver.findElement(By.xpath("//input[@id='login']"));
    btnLogin.click();    
}



}
