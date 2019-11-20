package factoryPatternV2_RE;

public class STCheesePizza extends STstylePizza {

	public STCheesePizza() {
		name = super.style + "traditional Cheese Pizza";
		dough = super.dough + "More thick";
		sauce = super.sauce + "Deep whipping with Red Tomato";
		toppings.add("clam");
	}
	
	@Override
	public void boxing() {
		System.out.println("Boxing into Specail made pizza Box");
	}
}
