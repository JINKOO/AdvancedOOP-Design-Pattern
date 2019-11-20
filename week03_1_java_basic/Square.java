package week03_1_java_basic;

public class Square extends Rectangle {
	
	public Square(int width) {
		super(width, width);
	}
	
	
	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);
	}
	
	
	@Override
	public void setHeight(int height) {
		super.setWidth(height);
		super.setHeight(height);
	}
}
