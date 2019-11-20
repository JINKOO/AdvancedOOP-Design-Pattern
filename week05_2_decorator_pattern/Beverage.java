package week05_2_decorator_pattern;


/*
 *  Component�� �ش��ϴ� class�̴�.
 *  Interface Ȥ�� Abstract�� �����Ѵ�.
 *  
 *  �� Beverage�� ��ӹ޴� class�� 
 *  Decorator(ConcreateDecorator�� ��ӹ޴´�.// ConcreteComponent�̴�.)
 */
public abstract class Beverage {

	String description = "���� ����";
	
	public Beverage() {
		
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract double cost();
}
