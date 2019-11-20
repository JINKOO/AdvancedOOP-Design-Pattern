package week03_1_java_basic;

/*
 * 리스코프 이론(상속 관계)
 * sub class는 super class를 대체 할 수 있어야 한다. 
 * super 객체 대신 sub의 객체를 이용하였을 때 문제 없이 프로그램이 동작하여야 한다.
 * 즉, upCasting하였을 때 문제 없이 실행 되어야 한다. 
 * ex)
 * 직사각형 과 정사각형 class 관계
 */
public class Main {

	public static void main(String[] args) {
			
		//아래 4줄은 당연한 결과
		Rectangle r = new Rectangle(3, 5);
		System.out.println(r.getPerimeter());
		Square s = new Square(6);
		System.out.println(s.getPerimeter());
		
		
		//여기서 부터 문제가 발생한다. 
		r = s;                 //upCasting
		r.setWidth(4);       
		r.setHeight(5);     
		//내가 원하는 결과는 가로4, 세로5인 직사각형
		//but (4,4), (5,5)인 정사각형이 만들어진다.
		//이는 upCasting으로 인하여 메소드 오버라이딩이 발생
		System.out.println(r.getPerimeter());
		
	}
}
