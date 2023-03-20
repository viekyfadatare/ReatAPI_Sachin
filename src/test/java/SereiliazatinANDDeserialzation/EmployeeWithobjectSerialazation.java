package SereiliazatinANDDeserialzation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJO.EmployeeWithObject;
import POJO.Spouse;

public class EmployeeWithobjectSerialazation {

	@Test
	public void Serialazation() throws Exception, JsonMappingException, IOException {
		
		int [] arr = {123454,787898};
		
		Spouse s = new Spouse("Rekha", arr);
		
		EmployeeWithObject eo = new EmployeeWithObject("Vieky", s);
		
		ObjectMapper om = new ObjectMapper();
		
		om.writeValue(new File("./Serialization/empObject.json"), eo);
		
		
	}
	
}
