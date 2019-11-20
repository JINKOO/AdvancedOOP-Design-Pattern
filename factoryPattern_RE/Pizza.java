package factoryPattern_RE;

/*
 * Pizza¿« Class
 */
public class Pizza {

	public Pizza() {
		
	}
	
	public void prepare() {
		System.out.println("Prepare for..");
	}
	
	public void bake() {
		System.out.println("Bake at 350Degree...");
	}
	
	public void cut() {
		System.out.println("Slice in triangle");
	}
	
	public void boxing() {
		System.out.println("Put pizza in official box");
	}
}
