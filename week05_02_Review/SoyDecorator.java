package week05_02_Review;

public class SoyDecorator extends Decorator {

	private Beverage beverage;
	private double soyCost = .23;
	
	public SoyDecorator(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "With SoyMilk ";
	}
	
	@Override
	public double cost() {
		return beverage.cost() + this.soyCost; 
	}
}
