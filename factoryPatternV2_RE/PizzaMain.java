package factoryPatternV2_RE;

public class PizzaMain {

	public static void main(String[] args) {
		
		PizzaStore nyStore = new NYPizzaFactory();
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Mr Ko ordered " + pizza.getName());
		System.out.println();
		
		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Mr Cho ordered " + pizza.getName());
		System.out.println();
		
		PizzaStore stStore = new STPizzaFactory();
		pizza = stStore.orderPizza("cheese");
		System.out.println("Mr Park ordered " + pizza.getName());
		System.out.println();
		
		stStore.orderPizza("pepperoni");
		System.out.println("Mr Woo ordered " + pizza.getName());
		System.out.println();
	}
}
