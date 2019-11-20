package factoryPatternV2_RE;

public class STPizzaFactory extends PizzaStore {

	public STPizzaFactory() {
		
	}
	
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese"))
			pizza = new STCheesePizza();
		else if(type.equals("pepperoni"))
			pizza = new STPepperoniPizza();
		
		return pizza;
	}
}
