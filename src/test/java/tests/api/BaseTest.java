package tests.api;
import commonLibs.configReaders.ConfigReader;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import static io.restassured.RestAssured.given;

//@Listeners({CustomTestListener.class})
public class BaseTest {
    protected ConfigReader reader;
    protected String userstEndpoint;

    @BeforeTest
    public void setup(){
        reader = new ConfigReader();
        RestAssured.baseURI = reader.getUrl();
        userstEndpoint = reader.getUsersEndpoint();
    }
}
