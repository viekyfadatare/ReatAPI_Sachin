package Authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Oauth2_0 {

	@Test
	public void oauthAuthentication()
	{
		// SDET_45
// https://example.com
		//http://coop.apps.symfonycasts.com/token


		//Create a request to generate accesss token 
		Response resp = given()
		 .formParam("client_id", "SDET_45")
		 .formParam("client_secret", "f177d2fe3087abdaaccad0f190463261")
		 .formParam("grant_type", "client_credentials")
		 .formParam("redirect_uri", "https://example.com")
		 .formParam("code", "authorization_code")
		 
	    .when()
	     .post("http://coop.apps.symfonycasts.com/token");
	     
	    //Capture the access token from the response of the above request
		String token = resp.jsonPath().get("access_token");
		System.out.println(token);
		
		
		//Create another request and use the token to access the APIs
		given()
		 .auth().oauth2(token)
		 .pathParam("USER_ID", 4340)
		 
		.when()
		 .post("http://coop.apps.symfonycasts.com/api/{USER_ID}/toiletseat-down")
		 
		.then().log().all();
		 
		 
	}
	
}
