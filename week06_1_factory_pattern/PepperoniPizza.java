package week06_1_factory_pattern;

public class PepperoniPizza extends Pizza {

	private String type;
	
	public PepperoniPizza() {
		setDescription("Pepperoni");
		this.type = getDescriptioin();
	}
	
	@Override
	public void prepare() {
		System.out.println(type + "prepare");
	}
	
	@Override
	public void bake() {
		System.out.println(type + "bake");
	}
	
	@Override
	public void cut() {
		System.out.println(type + "cut");
	}
	
	@Override
	public void box() {
		System.out.println(type + "boxing");
	}
}
