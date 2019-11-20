package week05_2_decorator_pattern;

/*
 * ConcreteComponent Class
 */
public class DarkRoast extends Beverage {

	public DarkRoast() {
		// TODO Auto-generated constructor stub
		description = "다크로스트";
	}
	
	@Override
	public double cost() {
		return 2.0;
	}
}
