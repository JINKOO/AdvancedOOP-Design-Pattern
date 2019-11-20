package week12_1_adapter_pattern;

/*
 * Duck울 구현 해주는 MallardDuck class.
 */
public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Quack");
	}
	
	@Override
	public void fly() {
		System.out.println("I'm flying");
	}
}
