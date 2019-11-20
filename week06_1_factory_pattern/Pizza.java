package week06_1_factory_pattern;

public abstract class Pizza {

	private String description;
	
	public Pizza() {
		this.description = "General Pizza";
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescriptioin() {
		return this.description;
	}
	
	public void prepare() {
		System.out.println("prepare");
	}
	
	public void bake() {
		System.out.println("bake");
	}
	
	public void cut() {
		System.out.println("cut");
	}
	
	public void box() {
		System.out.println("boxing");
	}
}
