package week02_1_java_basic;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calcArea() {
		return radius * radius * Math.PI;
	}
	
	@Override
	public double calcPerimeters() {
		return 2 * radius * Math.PI;
	}
	
	public double getRadius() {
		return this.radius;
	}
}
