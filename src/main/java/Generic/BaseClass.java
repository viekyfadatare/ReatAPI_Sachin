package Generic;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public DatabaseLibrary dLib = new DatabaseLibrary();
	public JavaLibrary jLib = new JavaLibrary();
	public RestAssuredLibrary rLib = new RestAssuredLibrary();
	
	@BeforeSuite
	public void bsConfig() throws Throwable {

		baseURI = "http://localhost";
		port = 8084;

		dLib.connecttoDB();
		System.out.println(" ====Data Base Connection estblished ");
	}
	
	@AfterSuite
	public void asConfig() throws Throwable {
		
		
		dLib.closeDB();
		System.out.println("  === close Data Base Connection estblished  ");
	}
}
	
	

