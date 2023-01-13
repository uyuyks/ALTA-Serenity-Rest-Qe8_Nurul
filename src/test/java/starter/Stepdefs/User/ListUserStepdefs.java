package starter.Stepdefs.User;

import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matcher;
import starter.Utils.Constant;
import starter.reqres.ReqresAPI;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class ListUserStepdefs {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Get list user with page {int}")
    public void getListUserWithPagePage(int page) {
        reqresAPI.getListUser(page);
    }

    @When("Send request get list user")
    public void sendRequestGetListUser() {
        SerenityRest.when().get(Constant.GET_LIST_USER);
    }

    @Then("Should return status get code {int}")
    public void shouldReturnStatusCode(int code) {
        SerenityRest.then().statusCode(code);
    }

    @And("Response body should be page {int}")
    public void responseBodyShouldBePagePage(int page) {
        SerenityRest.and().body("page", equalTo(page));
    }

    @And("validate json schema list user")
    public void validateJsonSchemaListUser() {
        File jsonSchema = new File(Constant.JSON_SCHEMA + "Valid/ListUserSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }


    @Given("Get list user with page {string}")
    public void getListUser(String page) {
        reqresAPI.getListUser(page);
    }

    @And("Response body should be page {string}")
    public void responseBodyShouldBePagePage(String page) {
        SerenityRest.and().body("page", equalTo(page));
    }
}
