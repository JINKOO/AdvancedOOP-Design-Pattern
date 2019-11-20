package week06_1_factory_pattern;

public class PizzaTestDrive {

	public static void main(String[] args) {
		
		
		PizzaStore pizza = new PizzaStore(new SimplePizzaFactory());
		pizza.orderPizza("cheese");
		pizza.orderPizza("pepperoni");
	}
}
