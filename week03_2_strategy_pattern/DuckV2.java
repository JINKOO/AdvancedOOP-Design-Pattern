package week03_2_strategy_pattern;

/*
 * Duck Version2
 * 오리가 날다 라는 fly()를 추가
 * 이때 발생하는 문제점
 * doDuck()은 변경을 최소화하고자 한다.
 */
class Duck2 {
	
	void quack() {
		System.out.println("quack");
	}
	
	void swim() {
		System.out.println("swimming");
	}
	
	//
	void fly() {
		System.out.println("flying");
	}
	
	void display() {
		System.out.println("Duck");
	}
}

class MallardDuck2 extends Duck2 {
	
	@Override
	void display() {
		System.out.println("MallardDuck");
	}
}

class RedHeadDuck2 extends Duck2 {
	
	@Override
	void display() {
		System.out.println("RedHeadDuck");
	}
}

class RubberDuck extends Duck2 {
	
	@Override
	void quack() {
		System.out.println("squeak!");
	}
	
	@Override
	void display() {
		System.out.println("RdbberDuck");
	}
}


public class DuckV2 {
	
	public void doDuck(Duck2 duck2) {
		duck2.quack();
		duck2.swim();
		duck2.fly();
		duck2.display();
		
	}
	
	public static void main(String[] args) {
		
		DuckV2 d2 = new DuckV2();
		d2.doDuck(new Duck2());
		d2.doDuck(new MallardDuck2());
		d2.doDuck(new RedHeadDuck2());
		d2.doDuck(new RubberDuck());
		
	}
}
