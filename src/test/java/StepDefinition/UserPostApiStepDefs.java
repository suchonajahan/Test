package StepDefinition;

import Core.ApiCall;
import Core.FileHandleHelper;
import Core.HeaderFormatHelper;
import com.google.gson.Gson;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import repository.remoteRepo.requestRepo.UserPostRequestModelClass;
import repository.remoteRepo.responseRepo.UserPostAPIResponseModel;

import static Core.CoreConstrainHelper.base_url;
import static Core.FilePathHelper.postApiPath;

public class UserPostApiStepDefs {

    private Gson gson = new Gson();
    private String requestModel;

    UserPostRequestModelClass userPostRequestModelClass;
    Response postApiResponse;

    String url;
    @Given("user has the api {string}")
    public void userHasTheApiPath(String path) {
        url = base_url + path;
        
    }

    @When("user hit {string} and {string}")
    public void userHitNameAndJob(String name, String job) {
        JSONObject requestBody = new FileHandleHelper().readJsonFile(postApiPath);
        userPostRequestModelClass = new Gson().fromJson(requestBody.toJSONString(), UserPostRequestModelClass.class);
        userPostRequestModelClass.setJob(job);
        userPostRequestModelClass.setName(name);
        requestModel = gson.toJson(userPostRequestModelClass);
        
    }

    @And("call the api with body")
    public void callTheApiWithBody() {
        postApiResponse = ApiCall.postCall(HeaderFormatHelper.commonHeaders(),requestModel,url);
        System.out.println(postApiResponse.body().asString());
        
    }

    @Then("it will return created date data")
    public void itWillReturnCreatedDateData() {
        UserPostAPIResponseModel userPostAPIResponseModel = gson.fromJson(postApiResponse.getBody().asString(), UserPostAPIResponseModel.class);
        System.out.println(userPostAPIResponseModel.getCreatedAt());
    }
}
