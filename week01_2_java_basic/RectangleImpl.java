package week01_2_java_basic;

public class RectangleImpl implements IShape {

	private double width;
	private double height;
	
	public RectangleImpl(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calcArea() {
		return width * height;
	}
	
	@Override
	public double calcParameter() {
		return 2 * (width + height);
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getHeight() {
		return this.height;
	}
}
