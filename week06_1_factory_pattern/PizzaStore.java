package week06_1_factory_pattern;

public class PizzaStore {

	private SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	/*
	 * Version1
	 * 피자는 여러 종류가 있다.
	 * 또한 피자의 메뉴가 추가, 수정, 삭제 될때마다
	 * 아래의 코드를 수정해야한다.
	 * 변경되는 부분을 캡슐화 한다.
	 * SimplePizzaFactory를 생성하고 변경되는 부분을 이쪽으로 옮긴다.
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
	 * 피자 메뉴가 변경되는 부분들을 SimplePizzaFactoy로 
	 * 옮긴 후의 orderPizza
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
