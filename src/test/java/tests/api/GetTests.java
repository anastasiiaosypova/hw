package tests.api;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

public class GetTests extends BaseTest{

    @Test
    public void verifyGetReturnUser() {
        given().when().get(reader.getUsersEndpoint()).then().statusCode(200).body(containsString("Leanne Graham"));
    }

    @Test
    public void verifyGetSuccessfull() {
        given().when().get(reader.getUsersEndpoint()).then().statusCode(200);
    }
}
