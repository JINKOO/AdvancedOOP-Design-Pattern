package week03_2_strategy_pattern;

/*
 * interface로 해결하고자 한다.
 * doDuck()에서 사용하지 못하는 함수가 발생한다. 
 * 해결은 Version5참고
 */

class Duck3 {
	
	void swim() {
		System.out.println("swimming");
	}
	
	void display() {
		System.out.println("Duck");
	}
}

interface Flyable {
	public void fly();
}

interface Quackable {
	public void quack();
}

class MallardDuck3 extends Duck3 implements Flyable, Quackable {
	
	@Override
	void display() {
		System.out.println("MallardDuck");
	}
	
	@Override
	public void fly() {
		System.out.println("flying");
	}
	
	@Override
	public void quack() {
		System.out.println("quack");
	}
}

class RedHeadDuck3 extends Duck3 implements Flyable, Quackable {
	
	@Override
	void display() {
		System.out.println("RedHeadDuck");
	}
	
	@Override
	public void fly() {
		System.out.println("flying");
	}
	
	@Override
	public void quack() {
		System.out.println("quack");
	}
}

class RubberDuck3 extends Duck3 implements Flyable, Quackable {
	
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


public class DuckV3 {

	public void doDuck(Duck3 duck) {
		duck.display();
//		duck.fly();
		duck.swim();
//		duck.quack();
	}
	
	public static void main(String[] args) {
		
		Duck3 d3 = new Duck3();
		MallardDuck3 md3 = new MallardDuck3();
		RedHeadDuck3 rhd3 = new RedHeadDuck3();
		RubberDuck3  rd3 = new RubberDuck3();
		
		d3.display();
		md3.display();
		rhd3.display();
		rd3.display();
		
//		d3.quack();
		md3.quack();
		rhd3.quack();
		rd3.quack();
		
//		d3.fly();
		md3.fly();
		rhd3.fly();
		rd3.fly();
		
//		DuckV3 d3 = new DuckV3();
//		d3.doDuck(new Duck3());
		
	}
}
