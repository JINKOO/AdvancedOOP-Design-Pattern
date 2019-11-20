package week10_2_command_pattern;

/*
 * Streo ��� ���ù� class�̴�.
 * light�� garageDoor�� ���� ������ class�̴�.
 */
public class Stereo {

	private String roomType;
	
	public Stereo(String roomType) {
		// TODO Auto-generated constructor stub
		this.roomType = roomType;
	}
	
	public void on() {
		System.out.println(roomType + " Stereo ON");
	}
	
	public void off() {
		System.out.println(roomType + " Stereo OFF");
	}
	
	public void setCD(String typeCD) {
		System.out.println("Stereo ready to play CD: " + typeCD);
	}
	
	public void setDVD(String typeDVD) {
		System.out.println("Stereo ready to play DVD: " + typeDVD);
	}
	
	public void setRadio(String channel) {
		System.out.println("Stereo set Radio channel: " + channel);
	}
	
	public void setVolume(int volume) {
		System.out.println("Stereo set Volume: " + volume);
	}
}
