package SereiliazatinANDDeserialzation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJO.EmployeeWithArray;

public class EmployeeWithArraySerilization {

	
	@Test
	public void serialization() throws Exception, JsonMappingException, IOException {
		
		int [] arr = {12345,54321};
		
		EmployeeWithArray er = new EmployeeWithArray("Rekha", 23, arr);
		
		ObjectMapper om = new ObjectMapper();
		
		om.writeValue(new File("./Serialization/empArray.json"), er);
 		
		
	}
	
	
	
}
