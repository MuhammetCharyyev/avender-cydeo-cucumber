package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;

public class CalculatorStepsDefs {

    Integer actualResult; //make it global to use as actual in @Then

    @Given("Calculator app is opened")
    public void calculator_app_is_opened() {
        System.out.println("Calculator is opened");
    }
    @When("User add {int} to {int}")//there is exact int in our calculator.feature
    public void user_add_to(Integer int1, Integer int2) {
       actualResult = int1 +int2;
    }
    @Then("User should see {int} as result")
    public void user_should_see_as_result(Integer expectedResult) {
        Assert.assertEquals(expectedResult, actualResult);
    }



}
