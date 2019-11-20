package factoryPatternV2_RE;

public class NYPepperoniPizza extends NYstylePizza {

	public NYPepperoniPizza() {
		name = super.style + " Traditional Pepperoni";
		dough = super.dough + "with HandMade";
		sauce = super.sauce + "Special Cooking sauce";
		
		toppings.add("pepperoni");
	}
	
}
