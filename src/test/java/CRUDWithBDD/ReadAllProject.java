package CRUDWithBDD;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ReadAllProject {

	
	@Test
	
	public void ReadAll() {
		

		baseURI = "http://localhost";
		port = 8084;
		
		when().get("/projects")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).time(Matchers.lessThan(5000l),TimeUnit.MILLISECONDS).log().all();
		
		
		
	}
	
}
