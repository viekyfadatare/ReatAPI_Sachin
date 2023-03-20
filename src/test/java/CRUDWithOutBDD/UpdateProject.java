package CRUDWithOutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import POJO.Ran;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProject {

	@Test
	public void update() {

		JSONObject jo = new JSONObject();

		jo.put("createdBy", "Aditi");
		jo.put("projectName", "yelopetra"+Ran.random());
		jo.put("status", "OnStart");
		jo.put("TeamSize", 5);

		
		RequestSpecification req = RestAssured.given();
		req.body(jo);
		req.contentType(ContentType.JSON);
		
		Response resp = req.put("http://localhost:8084/projects/TY_PROJ_1403");
		
		System.out.println(resp.contentType());
		System.out.println(resp.prettyPrint());
		System.out.println(resp.prettyPeek());
		System.out.println(resp.asString());
	}

}
