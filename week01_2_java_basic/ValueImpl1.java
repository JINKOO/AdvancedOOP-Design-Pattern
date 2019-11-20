package week01_2_java_basic;

public class ValueImpl1 implements IValue {

	private String name;
	
	public ValueImpl1(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
