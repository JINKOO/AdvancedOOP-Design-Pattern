package factoryPatternV2_RE;

import java.util.ArrayList;

public abstract class Pizza {

	protected String style;
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings;
	
	public Pizza() {
		this.toppings = new ArrayList<>();
	}
	
	
	/*
	 * 필요시 각각을 Override한다. 
	 */
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough... " + dough);
		System.out.println("Adding sauce... " + sauce);
		System.out.println("Adding toppings:  ");
		for(int i = 0; i<toppings.size(); i++) {
			System.out.print(" " + toppings.get(i) + " ");
		}
		System.out.println();
	}
	
	public void bake() {
		System.out.println("Bake for 25minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cutting Pizza into diagonal slices");
	}
	
	public void boxing() {
		System.out.println("Place Pizza in official PizzaStore box");
	}
	
	public String getName() {
		return this.name;
	}
}
