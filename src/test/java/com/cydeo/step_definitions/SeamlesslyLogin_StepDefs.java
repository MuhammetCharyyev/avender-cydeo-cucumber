package com.cydeo.step_definitions;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.awt.dnd.DragGestureEvent;

public class SeamlesslyLogin_StepDefs {

    @Given("the user on the login page")
    public void the_user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlSeamlessly"));
    }
    @Given("the user is logged in with {string}")
    public void the_user_is_logged_in_with(String string) {

    }
    @Then("the user should see the url {string}")
    public void the_user_should_see_the_url(String string) {

    }
    @Then("the user should see the username as {string}")
    public void the_user_should_see_the_username_as(String string) {

    }
}
