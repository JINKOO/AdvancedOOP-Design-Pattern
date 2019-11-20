package week07_1_singleton_pattern;
/*
 * SingleTon
 * Class�� 1���� instance���� ���� �� �ֵ��� �ϰ�,
 * ��𼭳� ������ instance�� ���� �� �� �ֵ��� �Ѵ�. 
 * 
 * static, ���� �����ڸ� �� ����ؾ� �Ѵ�.
 * �������� Singleton���� ���������� 
 * ���������� ���� 1���� instance���� ���� �� �� �ֵ��� �Ѵ�.
 */
public class Singleton {

	//�ڱ� �ڽ��� Class���� ���� ���۷��� ������ �����Ѵ�.
//	private static Singleton uniqueSingleton;
	
	private volatile static Singleton uniqueSingleton;
	
	//��Ÿ �⺭ ����
	private String type;
	private int num;
	
	/*
	 * �����ڰ� private�̴�.
	 * ��, �ܺο��� ��ü�� �������� ���Ѵ�.
	 */
	private Singleton() {
		
	}
	
	public Singleton(String type, int num) {
		this.type = type;
		this.num = num;
	}
	
	/*
	 * Singleton������ instance������ ���� getInstace()������ �����ϴ�.
	 * 
	 */
//	public static Singleton getInstance() {
//		if(uniqueSingleton == null) {
//			uniqueSingleton = new Singleton();
//		}
//		return uniqueSingleton;
//	}
	
	
	/*
	 * volatile Ű���带 ����Ͽ��� ��
	 * DCL����̴�.
	 * �켱 �ν��Ͻ��� �����Ǿ����� �˻��ϰ�, �������� �ʾ��� ��쿡��
	 * ����ȭ�� �����Ѵ�. 
	 */
	public static Singleton getInstance() {
		if(uniqueSingleton == null) {
			synchronized (Singleton.class) {
				if(uniqueSingleton == null) {
					uniqueSingleton = new Singleton();
				}
			}
		}
		return uniqueSingleton;
	}
	
	
	//��Ÿ Method
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public String getType() {
		return this.type;
	}
	
	public static void main(String[] args) {
		
		Singleton s = Singleton.getInstance();
		s.setNum(11);
		s.setType("StringBuffer");
		
		System.out.println(s.getNum());
		System.out.println(s.getType());
		
		//s2��� ���ο� ���۷��� ������ ����, Singleton���� ��� ������ �����Ѵ�(s���� �̹� ����� ���ұ� ����).
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.getNum());
		System.out.println(s2.getType());
	}
}
