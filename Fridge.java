package trainingday15OOPsINHERIPOLYMOR;

public class Fridge extends HomeAppliances {
	public String findDiscountAmount(int price) {
		if(price>10000&&price<20000) {
			int d=price*7/100;
			return d+"is discountAmount";
		}
		else if(price>20000&&price<30000) {
			int d=price*10/100;
		     return d+"is discountAmount";
	    }
	    else if(price>30000) {
	        int d=price*12/100;
	        return d+"is discountAmount";
	    }
	    else {
	    	return "Invalid";
	    }
		}

}
