package week05_2_decorator_pattern;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "µÎÀ¯";
	}
	
	
	@Override
	public double cost() {
		return beverage.cost() + .30;
	}
	
	
}
