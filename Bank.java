package trainingday15OOPsINHERIPOLYMOR;

public class Bank {
	public int loanEligibility() {
		return 30000;
	}
	public int loanEligibility(int salaryslip) {
		return (30000+(salaryslip*10));
	}
	public int loanEligibility(int salaryslip,int property) {
		return (30000+(salaryslip*10)+(property/5));
	}

}
