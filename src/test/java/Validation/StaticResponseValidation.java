package Validation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class StaticResponseValidation {

	@Test

	public void Staticvaliadtion() {

		baseURI = "http://localhost";
		port = 8084;
		
		String expData = "TY_PROJ_005";
		
		 // action
		Response resp = when().get("/projects");
		
		
		// Validtion
		String data = resp.jsonPath().getString("[1].projectId");
		
		Assert.assertEquals(expData,data );
		
		System.err.println("Data validation done sucssefully");
		resp.then().statusCode(200).log().all();
		

	}

}
