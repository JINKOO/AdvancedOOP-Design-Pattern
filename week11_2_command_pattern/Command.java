package week11_2_command_pattern;

/*
 * Undo()��� �߰�
 */
public interface Command {

	public void execute();
	public void undo();
	
}
