package week11_2_command_pattern;

public class CeilingFanHighCommand implements Command {

	private CeilingFan fan;
	private int prevSpeed;
	
	public CeilingFanHighCommand(CeilingFan fan) {
		// TODO Auto-generated constructor stub
		this.fan = fan;
	}
	
	@Override
	public void execute() {
		this.prevSpeed = fan.getSpeed();
		fan.high();
	}
	
	@Override
	public void undo() {
		if(this.prevSpeed == CeilingFan.HIGH)
			fan.high();
		else if(this.prevSpeed == CeilingFan.MEDIUM)
			fan.medium();
		else if(this.prevSpeed == CeilingFan.LOW)
			fan.low();
		else if(this.prevSpeed == CeilingFan.OFF)
			fan.off();
	}
}
