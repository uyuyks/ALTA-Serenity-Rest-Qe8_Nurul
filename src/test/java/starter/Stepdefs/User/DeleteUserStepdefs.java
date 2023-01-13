package starter.Stepdefs.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Constant;
import starter.reqres.ReqresAPI;

public class DeleteUserStepdefs {
    @Steps
    ReqresAPI reqresAPI;

    @Given("Delete user with valid id {int}")
    public void deleteUserWithValidIdId(int id) {
        reqresAPI.setDeleteUser(id);
    }

    @When("Send request delete user")
    public void sendRequestDeleteUser() {
        SerenityRest.when().delete(Constant.DELETE_USER);
    }

    @Then("Should return status delete code {int}")
    public void shouldReturnStatusDeleteCode(int code) {
        SerenityRest.then().statusCode(code);
    }

    @Given("Delete user with valid id {string}")
    public void deleteUserWithValidId(String id) {
        reqresAPI.setDeleteUser(id);
    }

    @Given("Delete user with invalid id {string}")
    public void deleteUserWithInvalidId(String id) {
        reqresAPI.setDeleteUser(id);
    }
}
