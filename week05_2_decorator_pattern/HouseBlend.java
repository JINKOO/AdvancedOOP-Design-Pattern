package week05_2_decorator_pattern;

/*
 * ConcreteComponent Class
 */
public class HouseBlend extends Beverage{

	public HouseBlend() {
		// TODO Auto-generated constructor stub
		description = "하우스 블렌드";
	}
	
	@Override
	public double cost() {
		return .89;
	}
}
