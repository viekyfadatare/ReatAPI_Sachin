package FourTypeToAddProject;

import org.hamcrest.Matchers; 
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import POJO.AddProject;
import POJO.Ran;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class POJO {

	@Test
	
	public void Addproject() {
	

	baseURI = "http://localhost";
	port = 8084;
	
	AddProject ap = new AddProject("Vikasratna", "Abcdfdef" + Ran.random(), "OPen", 10);
	
	
	given().body(ap).contentType(ContentType.JSON)
	
	.when().post("/addProject")
	.then().assertThat().statusCode(201).contentType(ContentType.JSON).time(Matchers.lessThan(5000l),TimeUnit.MILLISECONDS).log().all();
	
	
}
	
}
