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

public class UpdateUserStepdefs {
    @Steps
    ReqresAPI reqresAPI;


    @Given("Put update user with valid json with id {int}")
    public void putUpdateUserWithValidJsonWithId(int id) {
        File json = new File(Constant.REQUEST_JSON + "Valid/RequestUser.json");
        reqresAPI.putUpdateUser(id, json);
    }

    @When("Send request put update user")
    public void sendRequestPutUpdateUser() {
        SerenityRest.when().put(Constant.PUT_UPDATE_USER);
    }

    @Then("Should return status update code {int}")
    public void shouldReturnStatusUpdateCode(int code) {
        SerenityRest.then().statusCode(code);
    }

    @And("Response body update name should be {string} and job {string}")
    public void responseBodyUpdateNameShouldBeAndJob(String name, String job) {
        SerenityRest.then()
                .body("name", equalTo(name))
                .body("job", equalTo(job));
    }

    @Given("Put update user with invalid json with id {string}")
    public void putUpdateUserWithValidJsonWithIdId(String id) {
        File json = new File(Constant.REQUEST_JSON + "Invalid/InvalidRequestUser.json");
        reqresAPI.putUpdateUser(id, json);
    }
}
