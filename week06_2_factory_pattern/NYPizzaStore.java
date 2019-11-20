package week06_2_factory_pattern;

public class NYPizzaStore extends PizzaStoreV2 {

	@Override
	public PizzaV2 createPizza(String type) {
		
		PizzaV2 pizza = null;
		
		if(type.equals("cheese"))
			pizza = new NYCheesePizza();
		else if(type.equals("pepperoni"))
			pizza = new NYPepperoniPizza();
		return pizza;
	}
}
