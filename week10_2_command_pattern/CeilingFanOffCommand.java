package week10_2_command_pattern;

public class CeilingFanOffCommand implements Command {

	private CeilingFan fan;
	
	public CeilingFanOffCommand(CeilingFan fan) {
		// TODO Auto-generated constructor stub
		this.fan = fan;
	}
	
	@Override
	public void execute() {
		fan.off();
	}
}
