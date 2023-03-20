package Validation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import java.util.List;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class DynamicValidation {

	@Test
	public void DynamicValiadtion() {

		baseURI = "http://localhost";
		port = 8084;

		String expData = "TY_PROJ_4017";

		// action
		Response resp = when().get("/projects");

		// validation
		boolean flag = false;

		List<String> pids = resp.jsonPath().get("projectId");

		for (String proid : pids) {

			if (proid.equalsIgnoreCase(expData)) {
				flag = true;
			}

		}
		
		Assert.assertTrue(flag);
		
		System.err.println("Data Verification");
		
		resp.then().statusCode(200).log().all();
	}

}
