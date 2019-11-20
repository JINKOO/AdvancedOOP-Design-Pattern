package week02_1_java_basic;

public class ShapeMain {

	public static void main(String[] args) {
		
		Shape s = new Circle(3.);
		System.out.println("원 넓이: " + s.calcArea());
		System.out.println("원 둘레: " + s.calcPerimeters());
		
		s = new Rectangle(1., 2.);
		System.out.println("직사각형 넓이: " + s.calcArea());
		System.out.println("직사각형 둘레: " + s.calcPerimeters());
		
		
		RectangleImple2 r2 = new RectangleImple2(3., 2.);
		System.out.println("직사각형2 넓이: " + r2.calcArea());
		System.out.println("직사각형2 둘레: " + r2.calcPerimeter());
		
	}
}
