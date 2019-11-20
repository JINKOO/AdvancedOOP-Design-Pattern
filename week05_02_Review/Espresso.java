package week05_02_Review;

public class Espresso extends Beverage {

	private double cost = .43;

	public Espresso() {
	// TODO Auto-generated constructor stub
		setDescription("Espresso ");
	}
	
	@Override
	public double cost() {
		return this.cost;
	}
}
