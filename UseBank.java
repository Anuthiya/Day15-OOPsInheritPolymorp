package trainingday15OOPsINHERIPOLYMOR;

public class UseBank {
	public static void main(String args[]) {
		Bank c=new Bank();
		System.out.println(c.loanEligibility());
		System.out.println(c.loanEligibility(50000));
		System.out.println(c.loanEligibility(50000,100000));
	}
	}


