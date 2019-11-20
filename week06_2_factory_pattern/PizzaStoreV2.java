package week06_2_factory_pattern;

/*
 * 지점 별 PizzaStore가 있다.
 * 각 지역 마다 피자의 특성이 다르다.
 * NewYork지점
 * Chicago지점
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
	 * 지점 별로 피자의 특성이 다르기 때문에 abstract로 남겨둔다.
	 */
	public abstract PizzaV2 createPizza(String type);
	
}
