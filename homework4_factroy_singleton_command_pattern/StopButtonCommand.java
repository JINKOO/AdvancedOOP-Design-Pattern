package homework4_factroy_singleton_command_pattern;

import javax.swing.JButton;

public class StopButtonCommand extends CommandButton implements Command{

	PrimeObservableThread primeThread;
	String text;
	
	public StopButtonCommand(String text, PrimeObservableThread primeThread) {
		// TODO Auto-generated constructor stub
		super(text);
		this.primeThread = primeThread;
	}
	
	@Override
	public void execute() {
		primeThread.stopRunning();
	}
}
