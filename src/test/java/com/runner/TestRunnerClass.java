package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\adactinfeaturefile.feature" }, glue = {
		"com.stepdefinition" }, monochrome = false,plugin= {"html:target","json:target/output.json"})
public class TestRunnerClass {
	
	

}
