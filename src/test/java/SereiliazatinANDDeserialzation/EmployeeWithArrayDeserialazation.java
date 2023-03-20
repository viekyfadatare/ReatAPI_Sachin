package SereiliazatinANDDeserialzation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJO.Employee;
import POJO.EmployeeWithArray;

public class EmployeeWithArrayDeserialazation {

	@Test

	public void Deserialazation() throws Exception, JsonMappingException, IOException {

		ObjectMapper om = new ObjectMapper();

		EmployeeWithArray data = om.readValue(new File("./Serialization/empArray.json"), EmployeeWithArray.class);

		System.out.println(data.getName());
		System.out.println(data.getId());
  
		System.out.println(data.mobarr[0]);

	}

}
