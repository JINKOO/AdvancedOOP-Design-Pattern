package week10_2_command_pattern;


/*
 *  Invoker�� �ش��ϴ� class�̴�.
 *  ���⼭�� ��ư�� ������ �̴�. 
 */
public class RemoteControl {

	private Command[] onCommands;
	private Command[] offCommands;
	
	public RemoteControl() {
		// TODO Auto-generated constructor stub
		this.onCommands = new Command[7];
		this.offCommands = new Command[7];
		
		/*
		 * null ��ü�� ����Ͽ� ������ �迭�� �ʱ�ȭ �Ѵ�.
		 * �ʱ�ȭ �� ���� 5���� command��ü�� �����µ� ������ 2���� ���ڸ��̴�
		 * null�� ���� ó���� client���� ���� �ʰ� ���� �� null ��ü ������ ������ ����Ѵ�.
		 * ���⼭�� NoCommand instance�� Null��ü�̴�. 
		 */
		Command noCommand = new NoCommand();
		for(int i = 0; i<7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	//slot�� ��ư ��ȣ
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}
	
	
	public void onButtonWasPressed(int slot) {
		/*
		 * Null��ü�� ������� �ʾ��� ��� ������ ���� �Ѵ�.
		 * if(onCommands[slot] != null)
		 *	  onCommands[slot].execute();
		 */
		onCommands[slot].execute();
	}
	
	public void offButtonWasPressed(int slot) {
		offCommands[slot].execute();
	}

	
	@Override
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n============Remote Control==============\n");
		for(int i = 0; i<onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "    " 
					+ offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}
