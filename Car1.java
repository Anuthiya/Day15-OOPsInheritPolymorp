package trainingday15OOPsINHERIPOLYMOR;

public class Car1 extends Vehicle{
	private String model;
	private String colour;
	
	public void setModel(String model) {
		this.model=model;
	}
	public void setColour(String colour) {
		this.colour=colour;
	}
	public String getModel() {
		return model;
	}
	public String getColour() {
		return colour;
	}
	public Car1(String model, String colour,String brand, int price) {
		super(brand,price);
		this.model=model;
		this.colour=colour;
	}
	public String toString() {
		return(model+" "+colour+" "+super.toString());
		
	}

}



