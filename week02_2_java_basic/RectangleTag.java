package week02_2_java_basic;

public class RectangleTag extends ShapeTag{

	private String rectangleTag;
	
	public RectangleTag(String tag, String rectangleTag) {
		super(tag);
		this.rectangleTag = rectangleTag;
	}
	
	@Override
	public String toString() {
		return "#" + this.rectangleTag + " " + super.toString();
	}
	
	public String getRectangleTag() {
		return this.rectangleTag;
	}
}
