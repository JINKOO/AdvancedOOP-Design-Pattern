package week10_1_command_pattern;

/*
 * �������� ����ϱ� ���� Main Class
 * Client Class�� �ȴ�.
 * 
 */
public class RemoteControlTest {

	public static void main(String[] args) {
		
		//remote ������ Invoker������ �ϰ�, �ʿ��� �۾��� ��û�� ��, ����� command��ü�� ���ڷ� �����Ѵ�.
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		
		//Concrete Command Class�� light��ü�� �Ѱ��ش�.
		LightOnCommand lightOn = new LightOnCommand(light);
		
		//Invoker�� ���Ͽ� Command��ü�� ���� ���ش�. 
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		//GarageDoor �߰�
		GarageDoor garage = new GarageDoor();
		GarageDoorOpenCommand openGarage = new GarageDoorOpenCommand(garage);
		remote.setCommand(openGarage);
		remote.buttonWasPressed();
	}
}
