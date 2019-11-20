package factoryPattern_RE;

/*
 * PizzaStore Class�̴�.
 * ���⼭�� Factory Class�� ���� reference ������ ������.
 * 
 * Factory�� ����ϴ� Client�κ��̴�. 
 * Factory�� ����Ͽ� ���� instance�� �ް� �ȴ�. 
 * 
 * ���⼭�� Ư�� ����Class�� ����Ѵ�.
 * �� PizzaFactory��� Ư�� ���� Class�� �����Ѵ�.
 * 
 * ���� ���������� ����� �Ϸ���
 * ������ �ʿ��ϴ�. �� �������� ���� Pizza Store�� �����ϵ��� �Ѵ�. 
 */
public class PizzaStore {

	private PizzaFactory factory;
	
	public PizzaStore(PizzaFactory factory) {
		this.factory = factory;
	}
	
	public void prepareToBoxing(Pizza pizza) {
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.boxing();
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = factory.createPizza(type);
		prepareToBoxing(pizza);
		return pizza;
	}
}
