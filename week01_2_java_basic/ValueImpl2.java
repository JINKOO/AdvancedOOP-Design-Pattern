package week01_2_java_basic;

public class ValueImpl2 implements IValue{

private String name;
	
	public ValueImpl2() {
		this.name = "ValueImpl2";
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int getValue() {
		return 1;
	}
}
