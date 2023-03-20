package SereiliazatinANDDeserialzation;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJO.Employee;

public class EmployeeSerilazation {

	@Test
	public void Empser() throws Throwable, Throwable, Throwable {
		
		Employee e = new Employee("Vieky", 26, 9834064);
		
		ObjectMapper om = new ObjectMapper();
		
		om.writeValue(new File("./Serialization/"), e);
	}

}
