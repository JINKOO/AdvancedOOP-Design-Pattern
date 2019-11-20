package week02_2_java_basic;
import java.util.ArrayList;
import java.util.List;

/*
 * polymorphism
 * 다형성 관련
 * 메소드 오버라이딩
 */
public class ShapeTagMain {

	public static void print(List<ShapeTag> list) {
		
		for(Object o : list) {
			ShapeTag s = (ShapeTag)o;
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		
//		ShapeTag s1 = new ShapeTag("shape1");
//		ShapeTag s2 = new ShapeTag("shape2");
//		RectangleTag r1 = new RectangleTag("shape", "rectnagle");
//		CircleTag c1 = new CircleTag("shape", "circle");
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(r1);
//		System.out.println(c1);
//		
//		s1 = r1;
//		s2 = c1;
//		System.out.println(s1);
//		System.out.println(s2);
		
		ArrayList<ShapeTag> list = new ArrayList<>();
		list.add(new RectangleTag("shape", "rectangle"));
		list.add(new CircleTag("shape", "circleTag"));
//		list.add(new String("string"));
		
		ShapeTagMain.print(list);
	}
}
