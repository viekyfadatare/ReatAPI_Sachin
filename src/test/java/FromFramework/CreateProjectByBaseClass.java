package FromFramework;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Generic.EndpointsLibrary;
import POJO.AddProject;
import POJO.Ran;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateProjectByBaseClass extends BaseClass  {
	
	
	
	@Test
	public void addPro() throws Exception {
	
	// steps 1 create the requisites
	
   AddProject ap = new AddProject("Vikasaa", "Abcdvbhfdef" + jLib.randomNum(), "OPen", 12);
	
   
	// step 2 send the request 
   
	 Response resp =given().body(ap).contentType(ContentType.JSON)
	
	.when().post(EndpointsLibrary.creatProject);
	
	//step 3 capture the project ID
	 
	 String expdata = rLib.getJsonData(resp, "projectId");
	System.err.println(expdata);
	
	// step 4 validate the id in database
	
	String query = "select* from project";
	String actData = dLib.readDataFromDBAndValidate(query, 1, expdata);
	System.err.println(actData);
	
	Assert.assertEquals(expdata, actData);
	
	System.out.println("TestCase got passed");
	
	resp.then().log().all();
	
	
	
	}

}
