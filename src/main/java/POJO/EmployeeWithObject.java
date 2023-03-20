package POJO;

public class EmployeeWithObject {

	String name ;
	Spouse spouse;
	public EmployeeWithObject(String name, Spouse spouse) {
		super();
		this.name = name;
		this.spouse = spouse;
	}
	public EmployeeWithObject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Spouse getSpouse() {
		return spouse;
	}
	public void setSpouse(Spouse spouse) {
		this.spouse = spouse;
	}
	
	
	
}
