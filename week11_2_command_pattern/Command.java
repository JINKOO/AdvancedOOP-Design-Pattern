package week11_2_command_pattern;

/*
 * Undo()기능 추가
 */
public interface Command {

	public void execute();
	public void undo();
	
}
