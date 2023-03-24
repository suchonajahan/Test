import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class ValidateResponse {

    @Test
    public void getMethodCall() {

        RestAssured.baseURI = "https://reqres.in/api/users";

        given().queryParam("page", "2").header("Content-Type", "application/json").
                when().get().
        then().log().all()
                .assertThat().statusCode(200)
                .assertThat().time(lessThan(5000L))
                .assertThat().header("Content-Type", "application/json; charset=utf-8")
                .header("Connection", "keep-alive");

    }

    }


