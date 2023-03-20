package RequestChaing;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

import POJO.AddProject;
import POJO.Ran;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Chaining {

	@Test
	public void requestChaining() {

		baseURI = "http://localhost";
		port = 8084;

		AddProject ap = new AddProject("Adhirekha", "Shwerekha"+Ran.random(), "Open", 3);

		Response resp = given().body(ap).contentType(ContentType.JSON).when().post("/addProject");

		String proid = resp.jsonPath().get("projectId");

		System.err.println(proid);
		resp.then().log().all();
		
		
	/*	given().pathParam("pid", proid)  // this one is with path Parameter 		
		when().get("/projects/{pid}")*/
		
		
		when().get("/projects/"+proid)    //  This one is with the help of direct varialble
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();

	}

}
