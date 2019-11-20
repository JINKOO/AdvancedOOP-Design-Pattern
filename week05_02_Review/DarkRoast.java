package week05_02_Review;

public class DarkRoast extends Beverage {

	private double cost = .45;
	
	public DarkRoast() {
		// TODO Auto-generated constructor stub
		setDescription("DarkRoast::Coffee ");
	}
	
	@Override
	public double cost() {
		return this.cost;
	}
}
