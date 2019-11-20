package week06_2_factory_pattern;

/*
 * ���� �� PizzaStore�� �ִ�.
 * �� ���� ���� ������ Ư���� �ٸ���.
 * NewYork����
 * Chicago����
 */
public abstract class PizzaStoreV2 {
	
	public PizzaV2 orderPizza(String type) {
		PizzaV2 pizza = createPizza(type);
		preparePizza(pizza);
		return pizza;
	}
	
	public void preparePizza(PizzaV2 pizza) {
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.boxing();
	}
	
	/*
	 * Factory pattern Method
	 * ���� ���� ������ Ư���� �ٸ��� ������ abstract�� ���ܵд�.
	 */
	public abstract PizzaV2 createPizza(String type);
	
}
