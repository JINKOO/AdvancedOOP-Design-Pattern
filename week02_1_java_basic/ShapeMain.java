package week02_1_java_basic;

public class ShapeMain {

	public static void main(String[] args) {
		
		Shape s = new Circle(3.);
		System.out.println("�� ����: " + s.calcArea());
		System.out.println("�� �ѷ�: " + s.calcPerimeters());
		
		s = new Rectangle(1., 2.);
		System.out.println("���簢�� ����: " + s.calcArea());
		System.out.println("���簢�� �ѷ�: " + s.calcPerimeters());
		
		
		RectangleImple2 r2 = new RectangleImple2(3., 2.);
		System.out.println("���簢��2 ����: " + r2.calcArea());
		System.out.println("���簢��2 �ѷ�: " + r2.calcPerimeter());
		
	}
}
