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

    @When("^i log in after my parent has made an account$")
    public void i_log_in_after_my_parent_has_made_an_account() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^i should see my account balance$")
    public void i_should_see_my_account_balance() throws Throwable {
        Assert.assertEquals(true, false);
    }
    
}
