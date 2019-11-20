package week02_1_java_basic;

public class RectangleImple2 extends Rectangle2 implements IShape{
	
	public RectangleImple2(double width, double height) {
		super(width, height);
	}
	
	@Override
	public double calcArea() {
		return getWidth() * getHeight();
	}
	
	@Override
	public double calcPerimeter() {
		return 2 * (getWidth() + getHeight());
	}

}
