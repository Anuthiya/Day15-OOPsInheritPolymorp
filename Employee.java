package trainingday15OOPsINHERIPOLYMOR;

public class Employee extends Human {
	private int id;
	private int salary;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public int getSalary() {
		return salary;
		
	}

}
