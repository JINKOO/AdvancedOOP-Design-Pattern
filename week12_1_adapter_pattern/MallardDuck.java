package week12_1_adapter_pattern;

/*
 * Duck�� ���� ���ִ� MallardDuck class.
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
