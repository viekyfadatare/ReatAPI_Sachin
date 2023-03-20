package FourTypeToAddProject;

import static io.restassured.RestAssured.baseURI;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class JsonFile {

	@Test
	public void addProject() throws Exception {
		
		baseURI = "http://localhost";
		port = 8084;
		
		
    //    File file=new File("./sach.json");
		
		given().log().all().body("{\r\n"
				+ "  \"createdBy\": \"strinfgg\",\r\n"
				+ "  \"projectName\": \"strinfgvkvjl\",\r\n"
				+ "  \"status\": \"open\",\r\n"
				+ "  \"teamSize\": 12\r\n"
				+ "}").contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).time(Matchers.lessThan(5000l),TimeUnit.MILLISECONDS)
		.log().all();
		
	
	}
}
	

