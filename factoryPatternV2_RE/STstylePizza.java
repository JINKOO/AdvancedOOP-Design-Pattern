package factoryPatternV2_RE;

public class STstylePizza extends Pizza {

	public STstylePizza() {
		style = "Seattle Style";
		dough = "Extra Thick Crust dough ";
		sauce = "Basic Balsamic Sauce";
		
		toppings.add("Basic HandMade Toppings");
	}
}
