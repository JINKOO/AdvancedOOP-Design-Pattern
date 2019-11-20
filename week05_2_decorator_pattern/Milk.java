package week05_2_decorator_pattern;

/*
 * ConcreteDecorator�� �ٽ���
 * ���� Class�ȿ���
 * ���������
 * Component������ ������ .
 */
public class Milk extends CondimentDecorator{

	private Beverage beverage;
	
	public Milk(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "����"; 
	}
	
	@Override
	public double cost() {
		return beverage.cost() + .80;
	}
}
