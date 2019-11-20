package week11_2_command_pattern;

/*
 *  Command pattern����
 *  client�� �ش��ϴ� class�̴�. 
 *  
 *  undo�ڵ� �߰�.
 */
public class RemoteLoader {

	public static void main(String[] args) {
		
		//1. setCommand()�ִ� Invoker�� �ش��ϴ� ��ü ����
		RemoteControl remoteControl = new RemoteControl();
		
		//2. Receiver ��ü ����
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garage = new GarageDoor();
		Stereo stereo = new Stereo("Living Room");
		
		//3. Concrete Command��ü ���� �� receiver����
	    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
	    LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
	    
//	    CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
//	    CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
	    
	    GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garage);
	    GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garage);
	    
	    StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
	    StereoOffCommand stereoOff = new StereoOffCommand(stereo);
	    
	    
		//4. �� command��ü�� remoteController�� ����
//	    remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//	    remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
//	    remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
//	    remoteControl.setCommand(3, garageDoorOpen, garageDoorClose);
//	    remoteControl.setCommand(4, stereoOnWithCD, stereoOff);
	     
//	    System.out.println(remoteControl.toString());
	    
//	    remoteControl.onButtonWasPressed(0);
//	    remoteControl.offButtonWasPressed(0);
//	    remoteControl.onButtonWasPressed(1);
//	    remoteControl.offButtonWasPressed(1);
//	    remoteControl.onButtonWasPressed(2);
//	    remoteControl.offButtonWasPressed(2);
//	    remoteControl.onButtonWasPressed(3);
//	    remoteControl.offButtonWasPressed(3);
//	    remoteControl.onButtonWasPressed(4);
//	    remoteControl.offButtonWasPressed(4);
	    
	  //5. Light�� undo Test
//	    remoteControl.onButtonWasPressed(0);
//	    remoteControl.offButtonWasPressed(0);
//	    System.out.println(remoteControl.toString());
//	    remoteControl.undoButtonWasPressed();
//	    remoteControl.offButtonWasPressed(0);
//	    remoteControl.onButtonWasPressed(0);
//	    System.out.println(remoteControl.toString());
//	    remoteControl.undoButtonWasPressed();
	    
	    
	    //6. undo�� ���¸� �����ϴ� CeilingFan Test
	    CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
	    CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
	    CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
	    CeilingFanOffCommand ceilingFanoff = new CeilingFanOffCommand(ceilingFan);
	    
	    remoteControl.setCommand(0, ceilingFanMedium, ceilingFanoff);
	    remoteControl.setCommand(1, ceilingFanHigh, ceilingFanoff);
//	    remoteControl.setCommand(2, ceilingFanLow, ceilingFanoff);	    
	    
	    remoteControl.onButtonWasPressed(0);
	    remoteControl.offButtonWasPressed(0);
	    System.out.println(remoteControl.toString());
	    remoteControl.undoButtonWasPressed();
	    
	    remoteControl.onButtonWasPressed(1);
	    System.out.println(remoteControl);
	    remoteControl.undoButtonWasPressed();
	    
	}
}
