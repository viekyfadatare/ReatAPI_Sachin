package POJO;

public class Employee {

	public String name;
	public int id;
	public int mob;

	public Employee(String name, int id, int mob) {
		super();
		this.name = name;
		this.id = id;
		this.mob = mob;
	}

	public Employee() {

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

	public int getMob() {
		return mob;
	}

	public void setMob(int mob) {
		this.mob = mob;
	}

}
