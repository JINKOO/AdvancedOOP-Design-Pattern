package week05_2_decorator_pattern;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	
	public Whip(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "ÈÖÇÎÅ©¸²";
	}
	
	@Override
	public double cost() {
		return beverage.cost() + .12;
	}
}
