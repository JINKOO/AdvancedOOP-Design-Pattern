package week11_2_command_pattern;

public class CeilingFanOffCommand implements Command {

	private CeilingFan fan;
	private int prevSpeed;
	
	public CeilingFanOffCommand(CeilingFan fan) {
		// TODO Auto-generated constructor stub
		this.fan = fan;
	}
	
	@Override
	public void execute() {
		prevSpeed = fan.getSpeed();
		fan.off();
	}
	
	@Override
	public void undo() {
		if(prevSpeed == CeilingFan.HIGH)
			fan.high();
		else if(prevSpeed == CeilingFan.MEDIUM)
			fan.medium();
		else if(prevSpeed == CeilingFan.LOW)
			fan.low();
		else if(prevSpeed == CeilingFan.OFF)
			fan.off();
	}
}
