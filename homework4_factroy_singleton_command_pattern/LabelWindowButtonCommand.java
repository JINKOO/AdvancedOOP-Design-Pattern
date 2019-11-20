package homework4_factroy_singleton_command_pattern;

import javax.swing.JButton;

public class LabelWindowButtonCommand extends ObservableCommandButton  {
	
	public LabelWindowButtonCommand(String text1, String text2, PrimeObservableThread primeThread, WindowProduct window) {
		// TODO Auto-generated constructor stub
		super(text1, text2, primeThread, window);
	}
}
