package com.comcast.crm.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {
	WebDriver driver;
	
	public LoginTest(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="username")
	WebElement type;

	@FindBy(xpath="product")
	WebElement product;
	

}
