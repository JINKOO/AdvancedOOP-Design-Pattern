package week05_02_Review;

/*
 * Decorator class
 * 장식에 해당하는 concrete Decorator가 모두 상속받는다.
 * 혹은 implements한다.
 */

public abstract class Decorator extends Beverage {

	public abstract String getDescription();
	
}
