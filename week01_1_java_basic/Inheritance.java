package week01_1_java_basic;

class Parent {
	
	private String name;
	
	Parent(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	void setName(String name) {
		this.name = name;
	}
}

class Child extends Parent {
	
	private int value;
	
	Child(String name, int value) {
		super(name);
		this.value = value;
	}
	
	int getValue() {
		return this.value;
	}
	
	void setValue(int value) {
		this.value = value;
	}
}

class ChildPlus1 extends Child {
	
	ChildPlus1(String name, int value) {
		super(name, value);
	}
	
	@Override
	int getValue() {
		return super.getValue() + 1;
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		Parent base = new Parent("Ko Jin Kweon");
		Child derived = new Child("Ko Jin KOO", 27);
		System.out.println(base.getName());
		System.out.println(derived.getName());
		
		//UpCasting
		Parent base2 = derived;
		System.out.println(base2.getName());
//		System.out.println(base2.getValue); //Error
		
		Child derived2 = (Child)base2;
		System.out.println(derived2.getName());
		System.out.println(derived2.getValue());
		
		Parent base3 = new ChildPlus1("ko", 25);
		ChildPlus1 derived3 = (ChildPlus1)base3;
		System.out.println(derived3.getValue());
		
	}
}
