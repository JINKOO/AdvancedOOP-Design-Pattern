package factoryPatternV2_RE;

public class NYstylePizza extends Pizza {

	public NYstylePizza() {
		style = "New York";
		dough = "Thin Crust dough";
		sauce = "Basic Tomato Sauce";
		
		toppings.add("Basic Toppings");
	}
}
