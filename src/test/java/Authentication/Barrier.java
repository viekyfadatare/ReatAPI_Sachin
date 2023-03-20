package Authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Barrier {

	@Test
	public void barriesToken() {
		
		
		baseURI ="https://api.github.com";
		JSONObject jObj = new JSONObject();
		jObj.put("name", "RishiBro1Thanks");
		
		given()
		 .auth()
		 .oauth2("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")
		 .body(jObj)
		 .contentType(ContentType.JSON)
		 
	    .when()
	     .post("/user/repos")
	     
	    .then().log().all();
		
	}
	
}
