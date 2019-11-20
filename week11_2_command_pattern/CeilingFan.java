package week11_2_command_pattern;

/*
 * undo����� �����ϴµ� ���¸� ����ϴ� ���.
 * 
 * undo�ÿ� ������ ���¸� �����ؾ� �ϴ� ��찡 �ִ�.
 * ���⼭�� ������ �ִ� on()�Լ��� �����
 * high, mediun, low�� �����Ѵ�.
 * 
 * �̿� ���� ���� CeilingFanOnCommand class��
 * ���� CeilingFanHighCommand, Medium, Low�� ���� �Ѵ�.
 */
public class CeilingFan {

	private String roomType;
	
	//���� ������ ���� ���� ���� (ǳ�� �ܰ�)
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	private int speed;
	
	
	public CeilingFan(String roomType) {
		// TODO Auto-generated constructor stub
		this.roomType = roomType;
		this.speed = OFF;         //��ǳ��� ó���� �����ִ�.
	}
	
//	public void on() {
//		System.out.println(roomType + " Fan ON");
//	}
	
	public void off() {
		speed = OFF;
		System.out.println(roomType + " Fan OFF");
	}
	
	public void high() {
		speed = HIGH;
		System.out.println(roomType + " Fan is on High");
	}
	
	public void medium() {
		speed = MEDIUM;
		System.out.println(roomType + " Fan is on Medium");
	}
	
	public void low() {
		speed = LOW;
		System.out.println(roomType + " Fan is on Low");
	}
	
	public int getSpeed() {
		return this.speed;
	}
}
