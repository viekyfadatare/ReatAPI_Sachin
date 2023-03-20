package Parameters;

import static io.restassured.RestAssured.given; 

import org.testng.annotations.Test;

public class QueryParameter {

	@Test
	public void QueryParametr() {
		
		 given()
		.queryParams("page","2")
		.when()
		.get("https://reqres.in/api/users")
		.then()
		.assertThat().statusCode(200)
		.log().all();
		 
		
	}
	
}
