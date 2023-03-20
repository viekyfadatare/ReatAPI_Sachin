package SereiliazatinANDDeserialzation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJO.EmployeeWithArray;
import POJO.EmployeeWithObject;

public class EmployeeWithobjectDeSerialazation {

	@Test
	public void Deserialzation() throws Exception, JsonMappingException, IOException {
		
		ObjectMapper om = new ObjectMapper();

		 EmployeeWithObject data = om.readValue(new File("./Serialization/empObject.json"), EmployeeWithObject.class);
		 
		 System.out.println(data.getName());

		 System.out.println(data.getSpouse().getSpouse());

		 System.out.println(data.getSpouse().getPhone()[1]);

	}
	
}
