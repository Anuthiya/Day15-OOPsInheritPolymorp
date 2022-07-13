package trainingday15OOPsINHERIPOLYMOR;

public class UseCivilEngineer {
	public static void main(String args[]) {
		String[] a=args[0].split(",");
		
		String designation=a[0];
		String workingSector=a[1];
		int salary=Integer.parseInt(a[2]);
		String work=a[3];
		
		CivilEngineer cv=new CivilEngineer();
		System.out.println(designation+" "+workingSector+" "+cv.showSalary(salary)+" "+cv.typeOfWork(work));
	}

}

class Engineer {
	private String designation;
	private String workingSector;
	
	public void setDesingation(String designation) {
		this.designation=designation;
	}
	public void setWorkingSector(String workingSector) {
		this.workingSector=workingSector;
	}
	public String getDesignation() {
		return designation;
	}
	public String getWorkingSector() {
		return workingSector;
	}
	public int showSalary(int salary) {
		return salary;
	}
}

class CivilEngineer extends Engineer {
	public String typeOfWork(String work) {
		return work;
	}
	public int showSalary(int pay) {
		return pay;
	}
}
