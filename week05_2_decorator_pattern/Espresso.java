package week05_2_decorator_pattern;

/*
 * ConcreteComponent Class
 */
public class Espresso extends Beverage{

	public Espresso() {
		// TODO Auto-generated constructor stub
		description = "����������";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}
}
