package week12_1_adapter_pattern;

public class Main {

	/*
	 * 기존에 있던 코드이다.
	 * Adapter를 사용하였어도
	 * 이 부분의 코드는 변하지 않는다. 
	 */
	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
	
	public static void main(String[] args) {
		
		//1. Duck 객체 생성
		MallardDuck duck = new MallardDuck();
		
		//2. Turkey객체 생성
		WildTurkey turkey = new WildTurkey();
		
		//3. Adapter생성 후 turkey변수를 넘겨준다.
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		testDuck(turkeyAdapter);
		
		
	}
}
