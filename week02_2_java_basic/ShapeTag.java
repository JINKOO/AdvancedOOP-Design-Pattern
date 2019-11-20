package week02_2_java_basic;

public class ShapeTag {

	private String tag;
	
	public ShapeTag(String tag) {
		this.tag = tag;
	}
	
	public String toString() {
		return "#" + tag;
	}
}
