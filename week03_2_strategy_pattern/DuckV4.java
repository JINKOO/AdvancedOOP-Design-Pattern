package week03_2_strategy_pattern;

/*
 * interface로 해결하고자 한다.
 * DuckV3에서 interface를 구현 하였는데
 * 이때 fly와 quack()이 코드가 중복된다.
 * 중복되는 코드는 Java8버전이후 interface에서 default method를 제공함으로써
 * interface에 default method를 구현하고
 * 경우에 따라 그냥 사용하던지 아니면  override할 수 있도록 한다.
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
