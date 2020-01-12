package week03_2_strategy_pattern;

import java.util.ArrayList;

/*
 * Interface 2가지로 뺀다.
 * fly()와 Quack()은 변동 사항이 많으므로
 * 이를 implements하는 class들을 만든다.
 */
interface FlyBehavior {
	
	public void fly();
}

interface QuackBehavior {
	
	public void quack();
	
}

// Context에 해당하는 class이다.
class ModelDuck {
	
	//Strategy에 대한 멤버 변수
	private FlyBehavior flybBehavior;
	private QuackBehavior quackBehavior;
	
//	ModelDuck() {
//		this.flybBehavior = new FlyNoWay();
//		this.quackBehavior = new Quack();
//	}
	
	void swim() {
		System.out.println("Swimming");
	}
	
	void display() {
		System.out.println("Duck");
	}
	
	void performFly() {
		flybBehavior.fly();
	}
	
	void performQuack() {
		quackBehavior.quack();
	}
	
	void setFlyBehavior(FlyBehavior fly) {
		flybBehavior = fly;
	}
	
	void setQuackBehavior(QuackBehavior quack) {
		quackBehavior = quack;
	}
}

/*
 * QuackBehavior interface 구현 class들 Strategy_n Class이다. 
 * 일반 Quack, Squeak, MuteQuack
 */
class Quack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("Quack!");
	}
}

class Squeak implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("Squeak");
	}
}

class MuteQuack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("No Quack");
	}
}

/*
 * FlyBehaviir interface 구현 class들
 * 날 수 있는, 날지 못하는
 */

class FlyWithWings implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("Flying");
	}
}

class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("can not fly");
	}
}

class MallardDuck5 extends ModelDuck {
	
	public MallardDuck5() {
		super.setFlyBehavior(new FlyWithWings());
		super.setQuackBehavior(new Quack());
	}
	
	@Override
	void display() {
		System.out.println("MallardDuck");
	}
//	@Override
//	void setFlyBehavior(FlyBehavior fly) {
//		super.setFlyBehavior(new FlyWithWings());
//	}
//	
//	@Override
//	void setQuackBehavior(QuackBehavior quack) {
//		super.setQuackBehavior(new Quack());
//	}
}

class RedHeadDuck5 extends ModelDuck {
	
	public RedHeadDuck5() {
		super.setFlyBehavior(new FlyWithWings());
		super.setQuackBehavior(new Squeak());
	}
	
	@Override
	void display() {
		System.out.println("RedHeadDuck");
	}	
}

class RubberDuck5 extends ModelDuck {
	
	public RubberDuck5() {
		super.setFlyBehavior(new FlyNoWay());
		super.setQuackBehavior(new MuteQuack());
	}
	
	@Override
	void display() {
		System.out.println("RubberDuck");
	}
}

public class DuckV5 {

	public void doDuck(ModelDuck d) {
		d.display();
		d.performQuack();
		d.swim();
		d.performFly();
		System.out.println("====================");
	}
	
	public static void main(String[] args) {
		
		ArrayList<ModelDuck> list = new ArrayList<>();
		list.add(new MallardDuck5());
		list.add(new RedHeadDuck5());
		list.add(new RubberDuck5());
		
		DuckV5 d5 = new DuckV5();
		for(ModelDuck d : list) {
			d5.doDuck(d);
		}
	}
}
