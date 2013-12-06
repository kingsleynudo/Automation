package com.pearson.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.activeteachonline.com/product")
@At("https://www.activeteachonline.com/product")
public class ProductPage extends PageObject {

	@FindBy(name="keyword")
    private WebElement keywordTerms;
	
	@FindBy(xpath="//a[@title='Log Out']")
	private WebElement logOut;
	
	public ProductPage(WebDriver driver) {
		super(driver);
		
	}
	public String getPageUrl() {
		
		return super.getDriver().getCurrentUrl();

	}
	public void logOut() {
		logOut.click();
		
	}
	
}


