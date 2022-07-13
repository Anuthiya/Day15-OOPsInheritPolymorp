package trainingday15OOPsINHERIPOLYMOR;

public class UseFridge {
	public static void main(String[] args) {
		Fridge f=new Fridge();
		HomeAppliances h=new HomeAppliances();
		System.out.println(f.findDiscountAmount(67000));
		System.out.println(h.findDiscountAmount(3000));
		
	}

}
