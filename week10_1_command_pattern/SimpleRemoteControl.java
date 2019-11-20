package week10_1_command_pattern;

/*
 * Command 객체를 사용하여 가정용 기기(여기서는 버튼이 1개밖에 없음)
 * 간단 조작할 수 있도록 하는 class
 * 즉 어떠한 Command를 실행 할 것인지 setCommand라는 함수가 있다.
 */
public class SimpleRemoteControl {

	private Command slot;
	
	public SimpleRemoteControl() {
		// TODO Auto-generated constructor stub
	}
	
	public void setCommand(Command command) {
		this.slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
}
