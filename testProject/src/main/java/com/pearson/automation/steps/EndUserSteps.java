package com.pearson.automation.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import static org.fest.assertions.Assertions.assertThat;

import com.pearson.automation.pages.LoginPage;
import com.pearson.automation.pages.ProductPage;

public class EndUserSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;
	LoginPage loginPage;

	ProductPage productPage;

	public EndUserSteps(Pages pages) {
		super(pages);
	}

	@Step
	public void is_the_home_page() {
		loginPage.open();
	}

	@Step
	public void enter_email(String email) {
		loginPage.enter_email(email);
	}

	@Step
	public void enter_password(String password) {
		loginPage.enter_password(password);
	}

	@Step
	public void should_be_taken_to_ProductPage() {
		productPage = getPages().currentPageAt(ProductPage.class);
		assertThat(productPage.getPageUrl().compareToIgnoreCase("https:/www.activeteachonline.com/product/"));
		productPage.logOut();
	}

	@Step
	public void click_login_button() {
		loginPage.login_submit();
	}

	@Step
	public void remainsOnHomePage() {
		loginPage =getPages().currentPageAt(LoginPage.class);
	}

}
