package CRUDWithBDD;

import org.hamcrest.Matchers; 

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import POJO.Ran;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;

public class CreateProject {

	@Test

	public void createProject() {

		baseURI = "http://localhost";
		port = 8084;
		
		
		JSONObject jo = new JSONObject();

		jo.put("createdBy", "Adhiti");
		jo.put("projectName", "Shwe" + Ran.random());
		jo.put("status", "Close");
		jo.put("TeamSize", 3);
		
		
		given().body(jo).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).time(Matchers.lessThan(5000l),TimeUnit.MILLISECONDS).log().all();
		

		
	}

}
