package week11_2_command_pattern;

/*
 *  Invoker에 해당하는 class이다.
 *  여기서는 버튼이 여러개 이다. 
 *  
 *  Undo()기능 추가함.
 */
public class RemoteControl {

	private Command[] onCommands;
	private Command[] offCommands;
	
	//undo기능을 수행하기 위한 변수 선언.
	private Command undoCommand;
	
	public RemoteControl() {
		// TODO Auto-generated constructor stub
		this.onCommands = new Command[7];
		this.offCommands = new Command[7];
		
		/*
		 * null 객체를 사용하여 각각의 배열을 초기화 한다.
		 * 초기화 후 각각 5개의 command객체가 들어오는데 나머지 2개는 빈자리이다
		 * null에 대한 처리를 client에서 하지 않고 싶을 때 null 객체 디자인 패턴을 사용한다.
		 * 여기서는 NoCommand instance가 Null객체이다. 
		 */
		Command noCommand = new NoCommand();
		for(int i = 0; i<7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		
		//undoCommand변수의 초기화(null 객체를 사용한다.)
		this.undoCommand = noCommand;
	}
	
	//slot은 버튼 번호
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}
	
	
	public void onButtonWasPressed(int slot) {
		/*
		 * Null객체를 사용하지 않았을 경우 다음과 같이 한다.
		 * if(onCommands[slot] != null)
		 *	  onCommands[slot].execute();
		 */
		onCommands[slot].execute();
		//undo를 위해 가장 마지막 작업을 undoCommand변수에 저장시킨다.
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPressed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	/*
	 * undo버튼 추가
	 * undo는 처음 실행되면 null 객체가 반환된다. 여기서 null 객체는 NoCommand객체이다.
	 * 따라서, 어떤 버튼click이 실행 되고 나서 이 부분이 수행 되어야 한다.
	 */
	public void undoButtonWasPressed() {
		undoCommand.undo();
	}

	@Override
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n============Remote Control==============\n");
		for(int i = 0; i<onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "    " 
					+ offCommands[i].getClass().getName() + "\n");
		}
		
		stringBuff.append("[undo] " + undoCommand.getClass().getName() + "\n");
		return stringBuff.toString();
	}
}
