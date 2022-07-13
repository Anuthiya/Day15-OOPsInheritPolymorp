package trainingday15OOPsINHERIPOLYMOR;

public class HomeAppliances {
	public String findDiscountAmount(int price) {
		if(price>1000&&price<2000) {
			int c=price*5/100;
			return c+"is discountAmount";
		}
		else if(price>2000&&price<5000) {
			int c=price*7/100;
		     return c+"is discountAmount";
	    }
	    else if(price>5000&&price<10000) {
	        int c=price*10/100;
	        return c+"is discountAmount";
	    }
	    else {
	    	return "Invalid";
	    }
		}
	}


