package tests.api;
import commonLibs.configReaders.ConfigReader;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import static io.restassured.RestAssured.given;

//@Listeners({CustomTestListener.class})
public class BaseTest {

    @BeforeTest
    public void setup(){
        ConfigReader reader = new ConfigReader();
        RestAssured.baseURI = reader.getUrl();
    }
}
