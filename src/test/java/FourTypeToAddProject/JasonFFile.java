package FourTypeToAddProject;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class JasonFFile {

	@Test
	public void Add() {
		
		baseURI = "http://localhost";
		port = 8084;
		
		
      File file=new File("./sach.json");
		
		given().body(file).contentType(ContentType.JSON)
		.when().post("/addProject")
		
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).time(Matchers.lessThan(5000l),TimeUnit.MILLISECONDS)
		.log().all();
	}
	
}
