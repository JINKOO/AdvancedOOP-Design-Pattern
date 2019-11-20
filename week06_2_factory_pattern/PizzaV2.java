package week06_2_factory_pattern;

import java.util.ArrayList;

public abstract class PizzaV2 {

	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<>();
	
	public PizzaV2() {
		
	}
	
//	public void setType(String type) {
//		this.type = type;
//	}
	
	public String getName() {
		return this.name;
	}
	
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings : ");
		
		for(int i = 0; i<toppings.size(); i++) {
			System.out.println(" " + toppings.get(i));
		}
	}
	
	public void bake() {
		System.out.println("Bake for 25minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagnoal slices");
	}
	
	public void boxing() {
		System.out.println("Place the pizza in official PizzaStore Box");
	}
}
