package factoryPatternV2_RE;

public class NYPizzaFactory extends PizzaStore {

	public NYPizzaFactory() {
		
	}
	
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese"))
			pizza = new NYCheesePizza();
		else if(type.equals("pepperoni"))
			pizza = new NYPepperoniPizza();
		
		return pizza;
	}
}
