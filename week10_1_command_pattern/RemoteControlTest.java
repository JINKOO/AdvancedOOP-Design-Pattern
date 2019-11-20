package week10_1_command_pattern;

/*
 * 리모컨을 사용하기 위한 Main Class
 * Client Class가 된다.
 * 
 */
public class RemoteControlTest {

	public static void main(String[] args) {
		
		//remote 변수가 Invoker역할을 하고, 필요한 작업을 요청할 때, 사용할 command객체를 인자로 전달한다.
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		
		//Concrete Command Class에 light객체를 넘겨준다.
		LightOnCommand lightOn = new LightOnCommand(light);
		
		//Invoker를 통하여 Command객체를 전달 해준다. 
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		//GarageDoor 추가
		GarageDoor garage = new GarageDoor();
		GarageDoorOpenCommand openGarage = new GarageDoorOpenCommand(garage);
		remote.setCommand(openGarage);
		remote.buttonWasPressed();
	}
}
