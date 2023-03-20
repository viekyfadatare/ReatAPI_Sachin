package SereiliazatinANDDeserialzation;

import java.io.File; 
import java.io.IOException;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJO.Employee;

public class EmployeeDeserilazation {

	@Test
	public void DeserialzationEmp() throws Exception, JsonMappingException, IOException {
		
		ObjectMapper om = new ObjectMapper();
			
		Employee data = om.readValue(new File("./Serialization/emp.json"), Employee.class );
		
		System.out.println(data.getName());
		System.out.println(data.getMob());

		System.out.println(data.getId());
		
		
	}
	
}
