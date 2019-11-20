package week10_1_command_pattern;

/*
 * Command Pattern에서
 * Receiver Class에 해당한다. 
 * 특정 command가  execute되면 실제 명령을 수행한다. 
 */
public class Light {

	public Light() {
		// TODO Auto-generated constructor stub
	}
	
	public void on() {
		System.out.println("Light ON");
	}
	
	public void off() {
		System.out.println("Light OFF");
	}
}
