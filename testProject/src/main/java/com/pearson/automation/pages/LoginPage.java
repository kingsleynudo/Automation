package com.pearson.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.activeteachonline.com")
@At("https://www.activeteachonline.com")
public class LoginPage extends PageObject {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "email")
	private WebElement emailText;

	@FindBy(name = "password")
	private WebElement passwordText;

	@FindBy(name = "login")
	private WebElement loginButton;

	public void enter_email(String email) {
		$(emailText).setWindowFocus();
		$(emailText).typeAndTab(email);
	}

	public void enter_password(String password) {
		$(passwordText).setWindowFocus();
		$(passwordText).typeAndTab(password);
	}

	public void login_submit() {
		$(loginButton).setWindowFocus();
		$(loginButton).click();
	}

}
