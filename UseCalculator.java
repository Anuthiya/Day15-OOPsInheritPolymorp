package trainingday15OOPsINHERIPOLYMOR;

public class UseCalculator {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.sum(15));
		System.out.println(c.sum(12,17));
		System.out.println(c.sum(25,35,45));
	}

}
