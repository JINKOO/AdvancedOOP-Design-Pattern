package week10_1_command_pattern;

/*
 * ������ ������ �ϴ� Concrete Command Class�̴�. 
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
}
