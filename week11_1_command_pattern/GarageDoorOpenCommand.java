package week11_1_command_pattern;

/*
 * 차고문을 열리게 하는 Concrete Command Class이다. 
 */
public class GarageDoorOpenCommand implements Command {

	private GarageDoor garage;
	
	public GarageDoorOpenCommand(GarageDoor garage) {
		// TODO Auto-generated constructor stub
		this.garage = garage;
	}
	
	@Override
	public void execute() {
		garage.open();
	}
	
	@Override
	public void undo() {
		garage.close();
	}
}
