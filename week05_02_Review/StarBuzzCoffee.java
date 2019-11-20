package week05_02_Review;

public class StarBuzzCoffee {

	public static void showOriginalCoffee(String coffee, double cost) {
		System.out.println("Original " + coffee);
		System.out.println("Price :: $" + cost);
		System.out.println("====================");
	}
	
	public static void showWrapperCoffee(String coffee, double cost) {
		System.out.println("Decorated " + coffee);
		System.out.println("Price :: $" + cost);
		System.out.println("====================");
	}
	
	
	public static void main(String[] args) {
		
		//DarkRoast Coffee
		Beverage b1 = new DarkRoast();
		StarBuzzCoffee.showOriginalCoffee(b1.getDescription(), b1.cost());
		
		//Espresso Coffee
		Beverage b2 = new Espresso();
		StarBuzzCoffee.showOriginalCoffee(b2.getDescription(), b2.cost());
		
		//Decafe Coffee
		Beverage b3 = new Decafe();
		StarBuzzCoffee.showOriginalCoffee(b3.getDescription(), b3.cost());
		
		//HouseBlend Coffee
		Beverage b4 = new HouseBlend();
		StarBuzzCoffee.showOriginalCoffee(b4.getDescription(), b4.cost());
		
		///////////////////////////////////////////////////////////////////////////////
		b1 = new MilkDecorator(new WhipDecorator(b1));
		StarBuzzCoffee.showWrapperCoffee(b1.getDescription(), b1.cost());
		
		b2 = new SoyDecorator(new MochaDecorator(b2));
		StarBuzzCoffee.showWrapperCoffee(b2.getDescription(), b2.cost());
	}
}
