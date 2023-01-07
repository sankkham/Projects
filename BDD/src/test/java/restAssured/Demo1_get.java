package restAssured;

import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo1_get {

	@Test
	public void getWeatherDetails() {

		given().when()
		.get("https://demoqa.com/utilities/weather/city/Delhi")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.assertThat()
		.body("City", equalTo("Delhi"))
		.header("Content-Type", "application/json; charset=utf-8");
	}

}
