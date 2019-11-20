package week10_2_command_pattern;

public class StereoOffCommand implements Command {

	private Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		// TODO Auto-generated constructor stub
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}

}
