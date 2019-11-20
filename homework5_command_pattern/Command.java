package homework5_command_pattern;

import javax.swing.JLabel;

public interface Command {
	
	public void execute(JLabel label);
	public void undo(JLabel label);
	
}
