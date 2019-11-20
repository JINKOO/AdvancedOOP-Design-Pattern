package week05_2_decorator_pattern;

/*
 * Beverage를 상속받는
 * Decorator class
 * getDescription을 abstract로 하여
 * 각각의 ConcreteDecorator들이 Override할 수 있도록 한다.
 * 이는,
 * ConcreateComponent에서는 직접 Beverage를 상속받으므로 
 * description:String을 직접 접근할 수 있다.
 * 
 * 하지만 ConcreteDecorator에서는 각각 class안에
 * Component멤버변수가 있기때문에
 * Wrap을 하려면 반드시 override를 해야하기 때문이다. 
 */
public abstract class CondimentDecorator extends Beverage{

	public abstract String getDescription();
		
}
