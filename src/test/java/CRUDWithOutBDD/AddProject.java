package CRUDWithOutBDD;

import org.json.simple.JSONObject; 
import org.testng.annotations.Test;

import POJO.Ran;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class AddProject {

	
	@Test
	
	public void CreateProject() {
		
		JSONObject jo = new JSONObject();
		
		jo.put("createdBy", "Rrekhgsdna");
		jo.put("projectName", "Ppanddfda"+Ran.random());
		jo.put("status", "OnStart");
		jo.put("TeamSize", 5);
		
		RequestSpecification req = RestAssured.given();
		req.body(jo);
		req.contentType(ContentType.JSON);
		
		Response resp = req.post("http://localhost:8084/addProject");
		
		System.out.println(resp.contentType());
		System.out.println(resp.prettyPrint());
		System.out.println(resp.prettyPeek());
		System.out.println(resp.asString());


		
		
	}
	
}
