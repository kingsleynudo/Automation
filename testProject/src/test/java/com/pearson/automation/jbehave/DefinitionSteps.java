package com.pearson.automation.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.pearson.automation.steps.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the Active Teach home page")
    public void givenTheUserIsOnActiveTeachHomePage(String email, String password) {
        endUser.is_the_home_page(); 
    }
    @When("the user enters the email <email> in the email field")
    public void andTheUserEntersTheEmail(String email){
    	endUser.enter_email(email);
    }
    @When("the user enters the password <password> in the password field")
    public void andTheUserEntersThePassword(String password){
    	endUser.enter_password(password);
    }
    @When("the user clicks on the login button")
    public void whenTheUserClicksTheLoginButton() {
    	endUser.click_login_button();
    }

    @Then("the user should be taken to the product page")
    public void thenUserIsTakentoTheActiveTeachProductPage() {
        endUser.should_be_taken_to_ProductPage();
    }
    
    @Then("the user should remain on the Active Teach home page")
    public void thenUserRemainsOnActiveTeachHomePage(){
    	endUser.remainsOnHomePage();
    }

}
