package week03_1_java_basic;

/*
 * �������� �̷�(��� ����)
 * sub class�� super class�� ��ü �� �� �־�� �Ѵ�. 
 * super ��ü ��� sub�� ��ü�� �̿��Ͽ��� �� ���� ���� ���α׷��� �����Ͽ��� �Ѵ�.
 * ��, upCasting�Ͽ��� �� ���� ���� ���� �Ǿ�� �Ѵ�. 
 * ex)
 * ���簢�� �� ���簢�� class ����
 */
public class Main {

	public static void main(String[] args) {
			
		//�Ʒ� 4���� �翬�� ���
		Rectangle r = new Rectangle(3, 5);
		System.out.println(r.getPerimeter());
		Square s = new Square(6);
		System.out.println(s.getPerimeter());
		
		
		//���⼭ ���� ������ �߻��Ѵ�. 
		r = s;                 //upCasting
		r.setWidth(4);       
		r.setHeight(5);     
		//���� ���ϴ� ����� ����4, ����5�� ���簢��
		//but (4,4), (5,5)�� ���簢���� ���������.
		//�̴� upCasting���� ���Ͽ� �޼ҵ� �������̵��� �߻�
		System.out.println(r.getPerimeter());
		
	}
}
