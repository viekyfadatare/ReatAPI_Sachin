package FourTypeToAddProject;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import POJO.Ran;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class hashMap {

	@Test
	public void addProject() {

		baseURI = "http://localhost";
		port = 8084;
		
		HashMap map = new HashMap();

		map.put("createdBy", "Gappa");
		map.put("projectName", "Shreyu" + Ran.random());
		map.put("status", "Cklosed");
		map.put("TeamSize", 11);
		
		given().body(map).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).time(Matchers.lessThan(5000l),TimeUnit.MILLISECONDS).log().all();
		

	}

}
