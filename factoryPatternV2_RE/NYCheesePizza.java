package factoryPatternV2_RE;

public class NYCheesePizza extends NYstylePizza {

	public NYCheesePizza() {
		name = super.style + " CheesePizza";
		dough = super.dough + " Extra Thin";
		sauce = super.sauce + " Red tomato sauce";
		toppings.add(" Mozzarella cheese");
	}
	
	@Override
	public void cut() {
		System.out.println(" Cutting to 16");
	}
}
