package week03_2_strategy_pattern;

//Duck Version1
class Duck {
	
	void quack() {
		System.out.println("quack");
	}
	
	void swim() {
		System.out.println("swimming");
	}
	
	
	void display() {
		System.out.println("Duck");
	}
}

class MallardDuck extends Duck {
	
	@Override
	void display() {
		System.out.println("MallardDuck");
	}
}

class RedHeadDuck extends Duck {
	
	@Override
	void display() {
		System.out.println("RedHeadDuck");
	}
}


public class DuckV1 {

	public void doDuck(Duck duck) {
		duck.display();
		duck.quack();
		duck.swim();
	}
	
	public static void main(String[] args) {
		
//		Duck d1 = new Duck();
//		Duck d2 = new MallardDuck();
//		Duck d3 = new RedHeadDuck();
//		d1.display();
//		d2.display();
//		d3.display();
//		d1.quack();
//		d2.quack();
//		d3.quack();
		
		DuckV1 d1 = new DuckV1();
		d1.doDuck(new Duck());
		d1.doDuck(new MallardDuck());
		d1.doDuck(new RedHeadDuck());
		
	}
}
