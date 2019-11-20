package factoryPatternV2_RE;

public abstract class PizzaStore {

	public PizzaStore() {
		
	}
	
	public void prepareToBoxing(Pizza pizza) {
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.boxing();
	}
	
	/*
	 * �� �ȿ��� createPizza�� ȣ�� �Ѵ�.
	 * 
	 */
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		prepareToBoxing(pizza);
		
		return pizza;
	}
	
	/*
	 * Factory Method�� �� ��������
	 * Ư¡�� �°� ����ϵ��� �߻� interface�� ���� �Ѵ�.
	 */
	protected abstract Pizza createPizza(String type);
}
