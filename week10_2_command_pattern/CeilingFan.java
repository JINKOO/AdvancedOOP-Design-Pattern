package week10_2_command_pattern;

public class CeilingFan {

	private String roomType;
	
	public CeilingFan(String roomType) {
		// TODO Auto-generated constructor stub
		this.roomType = roomType;
	}
	
	public void on() {
		System.out.println(roomType + " Fan ON");
	}
	
	public void off() {
		System.out.println(roomType + " Fan OFF");
	}
}
