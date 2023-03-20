package Generic;

import io.restassured.response.Response;

/**
 * Consist of methods of Restassured
 * @author admin
 *
 */

public class RestAssuredLibrary {

	/**
	 * this method will return json data from the correspondind response body
	 * @param response
	 * @param path
	 * @return
	 */
	
	public String getJsonData(Response response , String path) {
		String jasonData = response.jsonPath().get(path);
		return jasonData;
		
	}
	
}
