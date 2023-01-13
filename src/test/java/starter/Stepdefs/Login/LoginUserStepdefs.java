package starter.Stepdefs.Login;

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

public class LoginUserStepdefs {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Post login user with {string} json {string}")
    public void postLoginUserWithJson(String params, String filename) {
        File json = new File(Constant.REQUEST_JSON + "/" + params + "/" + filename);
        reqresAPI.loginUser(json);
    }

    @When("Send request login user")
    public void sendRequestLoginUser() {
        SerenityRest.when().post(Constant.POST_LOGIN_USER);
    }

    @Then("Should return status login code {int}")
    public void shouldReturnStatusLoginCode(int code) {
        SerenityRest.then().statusCode(code);
    }

    @And("Validate response body login with valid json schema")
    public void validateResponseBodyLoginWithValidJsonSchema() {
        File jsonSchema = new File(Constant.JSON_SCHEMA + "Valid/ValidLoginUserSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @And("Validate response body login with invalid json schema")
    public void validateResponseBodyLoginWithInvalidJsonSchema() {
        File jsonSchema = new File(Constant.JSON_SCHEMA + "Invalid/InvalidLoginUserSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
