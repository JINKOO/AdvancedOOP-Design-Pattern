package week05_2_decorator_pattern;

public class Mocha extends CondimentDecorator{

	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "¸ğÄ«";
	}
	
	@Override
	public double cost() {
		return beverage.cost() + .20;
	}
}
