package homework5_command_pattern;

import javax.swing.JLabel;

/*
 * Null ��ü�� ��ȯ�ϴ� class�̴�. 
 */
public class NoCommand implements Command {

	public NoCommand() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void execute(JLabel label) {}
	
	@Override
	public void undo(JLabel label) {}
}
