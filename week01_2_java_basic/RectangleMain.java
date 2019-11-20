package week01_2_java_basic;

public class RectangleMain {

	public static void main(String[] args) {
		
		
		IShape r = new RectangleImpl(2.5, 3.4);
		System.out.println(r.calcArea());
		System.out.println(r.calcParameter());
	}
}
