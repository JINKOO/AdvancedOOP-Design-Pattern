package week03_2_strategy_pattern;

/*
 * interface�� �ذ��ϰ��� �Ѵ�.
 * DuckV3���� interface�� ���� �Ͽ��µ�
 * �̶� fly�� quack()�� �ڵ尡 �ߺ��ȴ�.
 * �ߺ��Ǵ� �ڵ�� Java8�������� interface���� default method�� ���������ν�
 * interface�� default method�� �����ϰ�
 * ��쿡 ���� �׳� ����ϴ��� �ƴϸ�  override�� �� �ֵ��� �Ѵ�.
 */

class Duck4 {
		
	void swim() {
		System.out.println("swimming");
	}
	
	void display() {
		System.out.println("Duck");
	}
}

interface Flyable2 {
	
	public default void fly() {
		System.out.println("flying");
	}
}

interface Quackable2 {
	
	public default void quack() {
		System.out.println("quack");
	}
}

class MallardDuck4 extends Duck4 implements Flyable2, Quackable2 {
	
	@Override
	void display() {
		System.out.println("MallardDuck");
	}
	
}

class RedHeadDuck4 extends Duck4 implements Flyable2, Quackable2 {
	
	@Override
	void display() {
		System.out.println("RedHeadDuck");
	}
	
}

class RubberDuck4 extends Duck4 implements Flyable2, Quackable2 {
	
	@Override
	void display() {
		System.out.println("RdbberDuck");
	}
	
	@Override
	public void fly() {
		System.out.println("cannot fly");
	}
	
	@Override
	public void quack() {
		System.out.println("squeak");
	}
}


public class DuckV4 {

	public void doDuck(Duck4 duck) {
		duck.display();
//		duck.fly();
		duck.swim();
//		duck.quack();
	}
	
	public static void main(String[] args) {
		
		Duck4 d4 = new Duck4();
		MallardDuck4 md = new MallardDuck4();
		RedHeadDuck4 rhd = new RedHeadDuck4();
		RubberDuck4 rd = new RubberDuck4();
		
		d4.display();
		md.display();
		rhd.display();
		rd.display();
		
//		d4.quack();
		md.quack();
		rhd.quack();
		rd.quack();
		
//		d4.fly();
		md.fly();
		rhd.fly();
		rd.fly();
		
//		DuckV3 d3 = new DuckV3();
//		d3.doDuck(new Duck3());
		
	}
}
