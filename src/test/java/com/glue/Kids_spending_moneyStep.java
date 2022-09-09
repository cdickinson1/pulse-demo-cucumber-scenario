package com.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Kids_spending_moneyStep {

    @Given("^I am a kid who has an account$")
    public void i_am_a_kid_who_has_an_account() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^kid logs in$")
    public void kid_logs_in() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^I should be redirected to the ledgar screen$")
    public void I_should_be_redirected_to_the_ledgar_screen() throws Throwable {
        Assert.assertEquals(true, false);
    }
    
}
