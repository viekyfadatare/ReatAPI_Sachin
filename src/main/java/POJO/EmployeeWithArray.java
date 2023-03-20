package POJO;

public class EmployeeWithArray {

	public String name;
	public int id;
	public int [] mobarr;
	
	
	public EmployeeWithArray(String name, int id, int[] mobarr) {
		super();
		this.name = name;
		this.id = id;
		this.mobarr = mobarr;
	}


	public EmployeeWithArray() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int[] getMobarr() {
		return mobarr;
	}


	public void setMobarr(int[] mobarr) {
		this.mobarr = mobarr;
	}
	
	
	
	
}
