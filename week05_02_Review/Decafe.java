package week05_02_Review;

public class Decafe extends Beverage {

	private double cost = .53;
	
	public Decafe() {
		// TODO Auto-generated constructor stub
		setDescription("No Caffein Coffe ");
	}
	
	@Override
	public double cost() {
		return this.cost;
	}
}
