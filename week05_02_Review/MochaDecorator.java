package week05_02_Review;

public class MochaDecorator extends Decorator {

	private Beverage beverage;
	private double mochaCost = .1;
	
	public MochaDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "With Mocha ";
	}
	
	@Override
	public double cost() {
		return beverage.cost() + this.mochaCost;
	}
}
