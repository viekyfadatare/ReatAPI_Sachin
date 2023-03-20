package FourTypeToAddProject;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import POJO.Ran;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class jsnoOBJECT {

	@Test
	public void AddProject() {
		
		baseURI = "http://localhost";
		port = 8084;
		
		
		JSONObject jo = new JSONObject();

		jo.put("createdBy", "TikTtyak");
		jo.put("projectName", "vieky" + Ran.random());
		jo.put("status", "Open");
		jo.put("TeamSize", 12);
		
		
		given().body(jo).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).time(Matchers.lessThan(5000l),TimeUnit.MILLISECONDS).log().all();
		

	}
	
}
