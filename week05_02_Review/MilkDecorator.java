package week05_02_Review;

public class MilkDecorator extends Decorator {

	private Beverage beverage;
	private double milkCost = .02;
	
	public MilkDecorator(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "With Milk ";
	}
	
	@Override
	public double cost() {
		return beverage.cost() + this.milkCost;
	}
}
