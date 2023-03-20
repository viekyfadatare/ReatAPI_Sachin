package CRUDWithBDD;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class DeleteProject {

	@Test
	
	public void DeleteProject() {
		
		baseURI = "http://localhost";
		port = 8084;
		
		when().delete("/projects/TY_PROJ_2607")
		.then().statusCode(204).contentType(ContentType.JSON).time(Matchers.lessThan(5000l),TimeUnit.MILLISECONDS).log().all();
	
	}
	
}
