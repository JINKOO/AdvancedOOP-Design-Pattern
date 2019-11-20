package week07_1_singleton_pattern;
/*
 * SingleTon
 * Class가 1개의 instance만을 만들 수 있도록 하고,
 * 어디서나 생성된 instance에 접근 할 수 있도록 한다. 
 * 
 * static, 접근 지정자를 잘 사용해야 한다.
 * 고전적인 Singleton패턴 구현에서는 
 * 물리적으로 오직 1개의 instance만을 생성 할 수 있도록 한다.
 */
public class Singleton {

	//자기 자신의 Class형을 가진 레퍼런스 변수를 선언한다.
//	private static Singleton uniqueSingleton;
	
	private volatile static Singleton uniqueSingleton;
	
	//기타 멤벼 변수
	private String type;
	private int num;
	
	/*
	 * 생성자가 private이다.
	 * 즉, 외부에서 객체를 생성하지 못한다.
	 */
	private Singleton() {
		
	}
	
	public Singleton(String type, int num) {
		this.type = type;
		this.num = num;
	}
	
	/*
	 * Singleton에대한 instance생성은 오직 getInstace()에서만 가능하다.
	 * 
	 */
//	public static Singleton getInstance() {
//		if(uniqueSingleton == null) {
//			uniqueSingleton = new Singleton();
//		}
//		return uniqueSingleton;
//	}
	
	
	/*
	 * volatile 키워드를 사용하였을 때
	 * DCL기법이다.
	 * 우선 인스턴스가 생성되었는지 검사하고, 생성되지 않았을 경우에만
	 * 동기화를 진행한다. 
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
	
	
	//기타 Method
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
		
		//s2라는 새로운 레퍼런스 변수를 만들어도, Singleton안의 모든 정보를 공유한다(s에서 이미 만들어 놓았기 때문).
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.getNum());
		System.out.println(s2.getType());
	}
}
