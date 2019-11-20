package week05_2_decorator_pattern;

/*
 * ConcreteDecorator의 핵심은
 * 각각 Class안에는
 * 멤버변수로
 * Component변수를 가진다 .
 */
public class Milk extends CondimentDecorator{

	private Beverage beverage;
	
	public Milk(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "우유"; 
	}
	
	@Override
	public double cost() {
		return beverage.cost() + .80;
	}
}
