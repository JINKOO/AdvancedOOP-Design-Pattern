package week05_2_decorator_pattern;

/*
 * ConcreateComponent Class
 */
public class Decaf extends Beverage {

	public Decaf() {
		// TODO Auto-generated constructor stub
		description = "��ī����Ŀ��";
	}
	
	@Override
	public double cost() {
		return 1.0;
	}
}
