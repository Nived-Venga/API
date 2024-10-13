package tests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import payload.Payload;
import utilities.ConvertStringToJSON;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RestAssured_NormalJSONs {

	@BeforeTest
	public void setUp() {
		RestAssured.baseURI = "https://rahulshettyacademy.com";

	}

	String response;
	String place_id;

	@Test
	public void addPlace() {

		/**** Add Place *****/
		response = given().log().all().queryParam("key", "qaclick123").headers("Content-Type", "application/json")
				.body(Payload.getAddPlacePayload()).when().post("/maps/api/place/add/json").then().log().all()
				.assertThat().statusCode(200).body("scope", equalTo("APP"))
				.header("server", equalTo("Apache/2.4.52 (Ubuntu)")).extract().response().asString();
		JsonPath json;
		// System.out.println("Response: " + response);
		json = ConvertStringToJSON.getJSON(response);
		// JsonPath jsonpath = new JsonPath(response);
		String statusCode = json.get("status");
		place_id = json.get("place_id");
		System.out.println("Response statuscode: " + statusCode);
		System.out.println("Response place id: " + place_id);
	}

	@Test
	public void updatePlace() {

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		/**** Update Place *****/

		response = given().log().all().queryParam("key", "qaclick123").headers("Content-Type", "application/json")
				.body(Payload.getUpdatePlacePayload(place_id)).when().put("/maps/api/place/update/json").then().log()
				.all().assertThat().statusCode(200).header("server", equalTo("Apache/2.4.52 (Ubuntu)"))
				.body("msg", equalTo("Address successfully updated")).extract().response().asString();

		System.out.println("Response: " + response);
	}

}
