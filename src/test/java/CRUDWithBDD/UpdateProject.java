package CRUDWithBDD;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import POJO.Ran;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class UpdateProject {

	
	@Test
	public void UpdateProject() {
		
		baseURI = "http://localhost";
		port = 8084;
		
		JSONObject jo = new JSONObject();

		jo.put("createdBy", "Pradeep");
		jo.put("projectName", "Ganehsa" + Ran.random());
		jo.put("status", "Close");
		jo.put("TeamSize", 4);
		
		
		given().body(jo).contentType(ContentType.JSON)
		.when().put("/projects/TY_PROJ_005")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).time(Matchers.lessThan(5000l),TimeUnit.MILLISECONDS).log().all();

	}
	
}
