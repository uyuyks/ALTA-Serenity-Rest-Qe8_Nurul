package starter.reqres;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class ReqresStepdefs {
//    @Steps
//    ReqresAPI reqresAPI;
//
//        @Given("Get list user with page {int}")
//        public void getListUserWithPage(int page) {
//            reqresAPI.getListUser(page);
//        }
//        @When("Send request get list user")
//        public void sendRequestGetListUser() {
//            SerenityRest.when().get(ReqresAPI.GET_LIST_USER);
//        }
//        @Then("Should return status code {int}")
//        public void shouldReturnStatusCode(int ok) {
//            SerenityRest.then().statusCode(ok);
//        }
//        @And("Response body should be page {int}")
//        public void responseBodyShouldPage(int page) {
//            SerenityRest.then().body("page", equalTo(page));
//        }
//
//    @Given("Post create user with valid json")
//    public void postCreateUserWithValidJson() {
//            File json = new File(ReqresAPI.REQUEST_JSON + "/RequestUser.json");
//            reqresAPI.postCreateUser(json);
//    }
//
//    @When("Send request post create user")
//    public void sendRequestPostCreateUser() {
//            SerenityRest.when().post(ReqresAPI.POST_CREATE_USER);
//    }
//
//    @And("Response body name should be {string} and job {string}")
//    public void responseBodyNameShouldBeAndJob(String name, String job) {
//        SerenityRest.then()
//                .body("name", equalTo(name))
//                .body("job", equalTo(job));
//    }
//
//    @Given("Put update user with valid json with id {int}")
//    public void putUpdateUserWithValidJsonWithId(int id) {
//        File json = new File(ReqresAPI.REQUEST_JSON + "/RequestUser.json");
//        reqresAPI.putUpdateUser(id, json);
//    }
//
//    @When("Send request put update user")
//    public void sendRequestPutUpdateUser() {
//            SerenityRest.when().put(ReqresAPI.PUT_UPDATE_USER);
//    }
//
//    @Given("Delete user with valid id {int}")
//    public void deleteUserWithValidIdId(int id) {
//            reqresAPI.setDeleteUser(id);
//    }
//
//    @When("Send request delete user")
//    public void sendRequestDeleteUser() {
//            SerenityRest.when().delete(ReqresAPI.DELETE_USER);
//        }
}
