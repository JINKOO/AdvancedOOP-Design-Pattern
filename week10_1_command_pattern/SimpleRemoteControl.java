package week10_1_command_pattern;

/*
 * Command ��ü�� ����Ͽ� ������ ���(���⼭�� ��ư�� 1���ۿ� ����)
 * ���� ������ �� �ֵ��� �ϴ� class
 * �� ��� Command�� ���� �� ������ setCommand��� �Լ��� �ִ�.
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
