package Parameters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class FormParameter {

	
	@Test
	
	public void FormPara() {
		
		baseURI = "http://localhost";
		port = 8084;
		
		given().formParam("createdBy","Vikey")
		.formParam("projectName", "Shew")
		.formParam("status" , "open")
		.formParam("teamSize" , 16)
		
		.when().post("/addProject")
		
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		
		
	}
}
