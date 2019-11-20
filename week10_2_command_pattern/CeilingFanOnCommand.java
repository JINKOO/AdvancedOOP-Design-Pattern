package week10_2_command_pattern;

public class CeilingFanOnCommand implements Command {

	private CeilingFan fan;

	public CeilingFanOnCommand(CeilingFan fan) {
		// TODO Auto-generated constructor stub
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.off();
	}

}
