package com.crd.dwh.automation.automation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
public class MyStep {
    @Given("today is Sunday")
    public void todayIsSunday () {
    }

    @When("I ask whether it's Friday yet")
    public void iAskWhetherItSFridayYet () {
    }

    @Then("I should be told {string}")
    public void iShouldBeTold (String arg0) {
        Assert.assertTrue(arg0.equalsIgnoreCase("Nope"));
    }
}
