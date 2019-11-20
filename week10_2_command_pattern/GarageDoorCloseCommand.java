package week10_2_command_pattern;

public class GarageDoorCloseCommand implements Command {
	
	private GarageDoor garage;

	public GarageDoorCloseCommand(GarageDoor garage) {
		// TODO Auto-generated constructor stub
		this.garage = garage;
	}

	@Override
	public void execute() {
		garage.close();
	}
}
