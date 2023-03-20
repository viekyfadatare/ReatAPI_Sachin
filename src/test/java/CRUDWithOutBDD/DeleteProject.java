package CRUDWithOutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteProject {

	@Test
	public void Delete() {
		
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		
		Response resp = req.delete("http://localhost:8084/projects/TY_PROJ_1014");
		
		System.out.println(resp.contentType());
		System.out.println(resp.prettyPrint());
		System.out.println(resp.prettyPeek());
		System.out.println(resp.asString());

		
	}
	
}
