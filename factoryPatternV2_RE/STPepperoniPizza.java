package factoryPatternV2_RE;

public class STPepperoniPizza extends STstylePizza {

	public STPepperoniPizza() {
		name = super.style + "Traditioinal Pepperoni";
		dough = super.dough + "Honey dough";
		sauce = super.sauce + "traditional handmade sauce";
		toppings.add("Balsamic Crunch");
	}
	
	@Override
	public void bake() {
		System.out.println("Bake with special Oven");
	}
}
