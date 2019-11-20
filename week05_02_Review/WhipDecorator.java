package week05_02_Review;

public class WhipDecorator extends Decorator {

	private Beverage beverage;
	private double cost = .11;
	
	public WhipDecorator(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "With Whip ";
	}
	
	@Override
	public double cost() {
		return beverage.cost() + this.cost;
	}
}
