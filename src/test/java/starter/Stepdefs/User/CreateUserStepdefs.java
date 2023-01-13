package starter.Stepdefs.User;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Constant;
import starter.reqres.ReqresAPI;

import static org.hamcrest.Matchers.equalTo;

import java.io.File;

public class CreateUserStepdefs {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Post create user with valid json")
    public void postCreateUserWithValidJson() {
        File json = new File(Constant.REQUEST_JSON + "Valid/RequestUser.json");
        reqresAPI.postCreateUser(json);
    }

    @When("Send request post create user")
    public void sendRequestPostCreateUser() {
        SerenityRest.when().post(Constant.POST_CREATE_USER);
    }

    @Then("Should return status create code {int}")
    public void shouldReturnStatusCreateCode(int code) {
        SerenityRest.then().statusCode(code);
    }

    @And("Response body name should be {string} and job {string}")
    public void responseBodyNameShouldBeAndJob(String name, String job) {
        SerenityRest.then()
                .body("name", equalTo(name))
                .body("job", equalTo(job));
    }

    @Given("Post create user with invalid json")
    public void postCreateUserWithInvalidJson() {
        File json = new File(Constant.REQUEST_JSON + "Invalid/InvalidRequestUser.json");
        reqresAPI.postCreateUser(json);
    }
}
