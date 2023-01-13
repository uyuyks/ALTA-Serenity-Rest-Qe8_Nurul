package starter.reqres;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.io.File;

public class ReqresAPI {

    @Step("Get list user")
    public void getListUser(int page){
        SerenityRest.given().pathParam("page", page);
    }

    @Step("Get list user")
    public void getListUser(String page){
        SerenityRest.given().pathParam("page", page);
    }

    @Step("Post create user")
    public void postCreateUser(File json){
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }

    @Step("Put update user")
    public void putUpdateUser(int id, File json){
        SerenityRest.given().pathParam("id", id).contentType(ContentType.JSON).body(json);
    }
    public void putUpdateUser(String id, File json){
        SerenityRest.given().pathParam("id", id).contentType(ContentType.JSON).body(json);
    }

    @Step("Delete user")
    public void setDeleteUser(int id){
        SerenityRest.given().pathParam("id", id);
    }
    public void setDeleteUser(String id){
        SerenityRest.given().pathParam("id", id);
    }

    @Step("Get Single User")
    public void getSingleUser(String id) {
        SerenityRest.given().pathParam("id", id);
    }

    @Step("Register User")
    public void registerUser(File json) {
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }

    @Step("Login User")
    public void loginUser(File json) {
        SerenityRest.given().contentType(ContentType.JSON).body(json);
    }
}
