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
		
		//1. Duck객체 생성
		MallardDuck duck = new MallardDuck();
		
		//2. Turkey객체 생성
		WildTurkey turkey = new WildTurkey();
		
		/*
		 * 3. Turkey는 TurkeyAdapter를 통하여 오리처럼 보이도록 wrap한다. 
		 *    실제 오리로 변경되는 것이 아니라, 오리처럼 행동 할 수 있도록 wrap을 해주는 것이다.
		 */ 
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says...");
		testDuck(duck);
		
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}
}
