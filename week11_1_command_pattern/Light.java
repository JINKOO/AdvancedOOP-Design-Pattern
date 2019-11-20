package week11_1_command_pattern;

/*
 * Command Pattern����
 * Receiver Class�� �ش��Ѵ�. 
 * Ư�� command��  execute�Ǹ� ���� ����� �����Ѵ�. 
 */
public class Light {

	private String roomType;
	
	public Light(String roomType) {
		// TODO Auto-generated constructor stub
		this.roomType = roomType;
	}
	
	public void on() {
		System.out.println(roomType + " Light ON");
	}
	
	public void off() {
		System.out.println(roomType + " Light OFF");
	}
}
