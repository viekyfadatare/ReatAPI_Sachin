package Parameters;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class PathParameter {

	@Test
	public void PathParameter() {
		
		baseURI = "http://localhost";
		port = 8084;
		
		given().pathParam("pid", "TY_PROJ_2804")
		.when().get("/projects/{pid}")
		
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).time(Matchers.lessThan(5000l),TimeUnit.MILLISECONDS).log().all();
		
		
	}
	
}
