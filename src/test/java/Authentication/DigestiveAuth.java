package Authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DigestiveAuth {


	@Test
	public void basicDigestiveAuth()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		given()
		 .auth().digest("rmgyantra", "rmgy@9999")
		 
		 .when()
		 .get("/login")
		 
		.then()
		 .assertThat().statusCode(202).log().all();
	}
	
	
	/*
	public static void main(String[] args) {
		
		baseURI = "http://localhost";
		port = 8084;
		
		given()
		 .auth().digest("rmgyantra", "rmgy@9999")
		 
		 .when()
		 .get("/login")
		 
		.then()
		 .assertThat().statusCode(202).log().all();
		
	} */
}
