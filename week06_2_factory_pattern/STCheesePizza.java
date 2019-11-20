package week06_2_factory_pattern;

public class STCheesePizza extends PizzaV2 {

	public STCheesePizza() {
		name = "ST style Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		toppings.add("Grated Mozzaralla Cheese");
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting the Pizza into Square Slices");
	}
}
