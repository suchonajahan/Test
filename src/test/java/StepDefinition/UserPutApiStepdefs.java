//package StepDefinition;
//
//import Core.ApiCall;
//import Core.FileHandleHelper;
//import Core.HeaderFormatHelper;
//import com.google.gson.Gson;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.restassured.response.Response;
//import org.json.simple.JSONObject;
//import org.testng.Assert;
//import repository.remoteRepo.requestRepo.UserPutRequestModelClass;
//import repository.remoteRepo.responseRepo.UserPutApiResponseModel;
//
//import static Core.CoreConstrainHelper.base_url;
//import static Core.FilePathHelper.idReaderPath;
//import static Core.FilePathHelper.updateFilePath;
//
//public class UserPutApiStepdefs {
//
//    private Gson gson = new Gson();
//    private String requestModel;
//
//    UserPutRequestModelClass userPutRequestModelClass;
//    Response putApiResponse;
//
//    String url;
//    @Given("user has the base api {string}")
//    public void userHasTheBaseApiPath() {
//        url = base_url + path;
//        FileHandleHelper file = new FileHandleHelper();
//        String id =file.readFile(idReaderPath);
//        url = url+id;
//
//    }
//
//    @When("user update {string} and {string}")
//    public void userUpdateNameAndJob() {
//        JSONObject requestBody = new FileHandleHelper().readJsonFile(updateFilePath);
//        userPutRequestModelClass = new Gson().fromJson(requestBody.toJSONString(), UserPutRequestModelClass.class);
//        userPutRequestModelClass.setJob(job);
//        userPutRequestModelClass.setName(name);
//        requestModel = gson.toJson(userPutRequestModelClass);
//
//    }
//
//    @And("call put Api with body")
//    public void callPutApiWithBody() {
//        putApiResponse = ApiCall.postCall(HeaderFormatHelper.commonHeaders(),requestModel,url);
//        System.out.println(putApiResponse.body().asString());
//
//    }
//
//    @Then("I receive valid response data")
//    public void iReceiveValidResponseData() {
//        if( putApiResponse.statusCode()==200) {
//            FileHandleHelper file = new FileHandleHelper();
//            file.clearFile(updateDateReaderFilepath);
//            UserPutApiResponseModel userPutApiResponseModel = gson.fromJson(putApiResponse.getBody().asString(), UserPutApiResponseModel.class);
//            Assert.assertEquals(userPutApiResponseModel.getStatus(), "PENDING");
//            file.writeFile(updateDateReaderFilepath,userPutApiResponseModel.getExpiration_date());
//
//        }
//}
