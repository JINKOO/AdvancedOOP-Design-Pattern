package week12_1_adapter_pattern;

public class Main {

	/*
	 * ������ �ִ� �ڵ��̴�.
	 * Adapter�� ����Ͽ��
	 * �� �κ��� �ڵ�� ������ �ʴ´�. 
	 */
	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
	
	public static void main(String[] args) {
		
		//1. Duck��ü ����
		MallardDuck duck = new MallardDuck();
		
		//2. Turkey��ü ����
		WildTurkey turkey = new WildTurkey();
		
		/*
		 * 3. Turkey�� TurkeyAdapter�� ���Ͽ� ����ó�� ���̵��� wrap�Ѵ�. 
		 *    ���� ������ ����Ǵ� ���� �ƴ϶�, ����ó�� �ൿ �� �� �ֵ��� wrap�� ���ִ� ���̴�.
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
