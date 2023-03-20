package POJO;

public class Spouse {

	String spouse;
	int [] phone;
	
	
	public Spouse(String spouse, int[] phone) {
		super();
		this.spouse = spouse;
		this.phone = phone;
	}


	public Spouse() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getSpouse() {
		return spouse;
	}


	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}


	public int[] getPhone() {
		return phone;
	}


	public void setPhone(int[] phone) {
		this.phone = phone;
	}
	
	
	
}
