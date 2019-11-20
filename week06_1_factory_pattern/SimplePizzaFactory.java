package week06_1_factory_pattern;

public class SimplePizzaFactory {

	public SimplePizzaFactory() {
		
	}
	
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese"))
			pizza = new CheesePizza();
		else if(type.equals("pepperoni"))
			pizza = new PepperoniPizza();
		
		return pizza;
	}
}
