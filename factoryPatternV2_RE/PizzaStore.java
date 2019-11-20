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
	 * 이 안에서 createPizza를 호출 한다.
	 * 
	 */
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		prepareToBoxing(pizza);
		
		return pizza;
	}
	
	/*
	 * Factory Method를 각 분점에서
	 * 특징에 맞게 사용하도록 추상 interface를 정의 한다.
	 */
	protected abstract Pizza createPizza(String type);
}
