package week02_1_java_basic;

public class Rectangle extends Shape {
	
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calcArea() {
		return width * height;
	}
	
	@Override
	public double calcPerimeters() {
		return 2 * (width + height);
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getWidth() {
		return this.width;
	}
}
