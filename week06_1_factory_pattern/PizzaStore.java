package week06_1_factory_pattern;

public class PizzaStore {

	private SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	/*
	 * Version1
	 * ���ڴ� ���� ������ �ִ�.
	 * ���� ������ �޴��� �߰�, ����, ���� �ɶ�����
	 * �Ʒ��� �ڵ带 �����ؾ��Ѵ�.
	 * ����Ǵ� �κ��� ĸ��ȭ �Ѵ�.
	 * SimplePizzaFactory�� �����ϰ� ����Ǵ� �κ��� �������� �ű��.
	 */
//	public Pizza orderPizza(String type) {
//		Pizza pizza = null;
//		
//		if(type.equals("cheese"))
//			pizza = new CheesePizza();
//		else if(type.equals("pepperoni"))
//			pizza = new PepperoniPizza();
//		
//		prepareToBoxing(pizza);
//		return pizza;
//	}
	
	/*
	 * Version2
	 * ���� �޴��� ����Ǵ� �κе��� SimplePizzaFactoy�� 
	 * �ű� ���� orderPizza
	 */
	public Pizza orderPizza(String type) {
		Pizza pizza = factory.createPizza(type);
		prepareToBoxing(pizza);
		return pizza;
	}
	
	public void prepareToBoxing(Pizza pizza) {
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
}
