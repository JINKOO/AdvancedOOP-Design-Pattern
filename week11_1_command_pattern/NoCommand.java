package week11_1_command_pattern;

/*
 * NoCommand 인스턴스는 일종의 null객체이다.
 * 딱히 return할 객체는 없지만
 * client쪽에서 null을 처리하도록 하지 않고 싶을때 null 객체를 사용한다.
 * 
 * 처음 remoteControl은 아무 명령도 할당되지 않은 상태이다.
 * 빈 자리를 채우는 용도로 사용한다.
 * 
 * null 객체는 디자인 패턴에서 많이 사용된다. 
 */
public class NoCommand implements Command {

	public NoCommand() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void execute() {}
	
	@Override
	public void undo() {}
}
