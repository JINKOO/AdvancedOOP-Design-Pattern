package week11_2_command_pattern;

/*
 * undo기능을 수행하는데 상태를 사용하는 방법.
 * 
 * undo시에 간단한 상태를 저장해야 하는 경우가 있다.
 * 여기서는 기존에 있던 on()함수를 지우고
 * high, mediun, low를 구현한다.
 * 
 * 이에 따라서 기존 CeilingFanOnCommand class를
 * 각각 CeilingFanHighCommand, Medium, Low로 분할 한다.
 */
public class CeilingFan {

	private String roomType;
	
	//상태 저장을 위한 변수 설정 (풍속 단계)
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	private int speed;
	
	
	public CeilingFan(String roomType) {
		// TODO Auto-generated constructor stub
		this.roomType = roomType;
		this.speed = OFF;         //선풍기는 처음에 꺼져있다.
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
