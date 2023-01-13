package starter.Stepdefs.User;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Constant;
import starter.reqres.ReqresAPI;

import java.io.File;

public class GetUserStepdefs {
    @Steps
    ReqresAPI reqresAPI;

    @Given("get single user with valid id {string}")
    public void getSingleUserWithId(String id) {
        reqresAPI.getSingleUser(id);
    }

    @When("Send request get single user")
    public void sendRequestGetSingleUser() {
        SerenityRest.when().get(Constant.GET_SINGLE_USER);
    }

    @Then("Should return status get single user code {int}")
    public void shouldReturnStatusGetSingleUserCode(int code) {
        SerenityRest.then().statusCode(code);
    }

    @And("validate response body with json schema")
    public void validateResponseBodyWithJsonSchema() {
        File jsonSchema = new File(Constant.JSON_SCHEMA + "Valid/SingleUserSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("get single user with invalid id {string}")
    public void getSingleUserWithInvalidId(String id) {
        reqresAPI.getSingleUser(id);
    }
}
