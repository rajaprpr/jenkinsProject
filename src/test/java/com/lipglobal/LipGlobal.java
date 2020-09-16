package com.lipglobal;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LipGlobal {

	public static WebDriver driver;

	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\Drivers\\chromedriver.exe");
		return driver = new ChromeDriver();
	}

	public void loadUrl(String url) {
		driver.get(url);
		maximizeWindow();
		
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public String getUrl() {
		String url = driver.getCurrentUrl();
		return url;
		
	}
	
	public void close() {
		driver.close();
	}
	public void quit() {
		driver.close();
	}
	
	public void type(WebElement element, String keys) {
		element.sendKeys(keys);
	}
	
	public String getAttributeValue(WebElement element) {
		String valueText = element.getAttribute("value");
		
		System.out.println(valueText +" Verified");
		return valueText;
	}
	
	public static void scrollDownPage() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true)", e);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		}
	
	public void getText(WebElement element) {
	element.getText();	
	}
	public void clickButton(WebElement element) {
		element.click();
	}
	

}
