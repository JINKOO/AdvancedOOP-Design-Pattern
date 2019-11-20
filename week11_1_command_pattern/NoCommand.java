package week11_1_command_pattern;

/*
 * NoCommand �ν��Ͻ��� ������ null��ü�̴�.
 * ���� return�� ��ü�� ������
 * client�ʿ��� null�� ó���ϵ��� ���� �ʰ� ������ null ��ü�� ����Ѵ�.
 * 
 * ó�� remoteControl�� �ƹ� ��ɵ� �Ҵ���� ���� �����̴�.
 * �� �ڸ��� ä��� �뵵�� ����Ѵ�.
 * 
 * null ��ü�� ������ ���Ͽ��� ���� ���ȴ�. 
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
