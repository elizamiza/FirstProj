import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by elizamae on 11/15/16.
 */
public class BellyGlueCode {
    @Given("^I have (\\d+) cukes in my belly$")
    public void i_have_cukes_in_my_belly(int arg1) throws Throwable {
        Belly belly = new Belly();
        belly.eat(arg1);
    }
    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^my belly should growl$")
    public void my_belly_should_growl() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
