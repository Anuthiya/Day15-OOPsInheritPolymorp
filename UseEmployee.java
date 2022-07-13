package trainingday15OOPsINHERIPOLYMOR;

public class UseEmployee {
	public static void main(String args[]) {
		Employee e=new Employee();
		e.setName("abcd");
		e.setAge(30);
		e.setGender("Male");
		e.setId(100);
		e.setSalary(100000);
		
		System.out.println(e.getName()+" "+e.getAge()+" "+e.getGender()+" "+e.getId()+" "+e.getSalary());
	}

}
