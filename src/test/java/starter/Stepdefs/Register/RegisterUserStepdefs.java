package starter.Stepdefs.Register;

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

public class RegisterUserStepdefs {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Post register user with {string} json {string}")
    public void postRegisterUserWithJson(String params, String filename){
        File json = new File(Constant.REQUEST_JSON + "/" + params + "/" + filename);
        reqresAPI.registerUser(json);
    }

    @When("Send request register user")
    public void sendRequestRegisterUser() {
        SerenityRest.when().post(Constant.POST_REGISTER_USER);
    }

    @Then("Should return status register code {int}")
    public void shouldReturnStatusRegisterCode(int code) {
        SerenityRest.then().statusCode(code);
    }

    @And("Validate response body with json schema")
    public void validateResponseBodyWithJsonSchema() {
        File jsonSchema = new File(Constant.JSON_SCHEMA + "Valid/ValidRegisterUserSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @And("Validate response body with invalid json schema")
    public void validateResponseBodyWithInvalidJsonSchema() {
        File jsonSchema = new File(Constant.JSON_SCHEMA + "Invalid/InvalidRegisterUserSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
