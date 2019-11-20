package week05_02_Review;

public class HouseBlend extends Beverage {

	private double cost = .25;
	
	public HouseBlend() {
		// TODO Auto-generated constructor stub
		setDescription("HouseBlend Coffee ");
	}
	
	@Override
	public double cost() {
		return this.cost;
	}
}
