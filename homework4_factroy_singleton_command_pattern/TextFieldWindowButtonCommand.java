package homework4_factroy_singleton_command_pattern;

import javax.swing.JButton;

public class TextFieldWindowButtonCommand extends ObservableCommandButton {

//	String text1;
//	String text2;
//	PrimeObservableThread primeThread;
//	WindowProduct window;
//	boolean textFieldWindowAdded = true;
	
	public TextFieldWindowButtonCommand(String text1, String text2, PrimeObservableThread primeThread, WindowProduct window) {
		// TODO Auto-generated constructor stub
		super(text1, text2, primeThread, window);
//		this.primeThread = primeThread;
//		this.window = window;
//		this.text2 = text2;
	}
	
//	@Override
//	public void execute() {
//		
//		if (textFieldWindowAdded) {
//           primeThread.removeObserver(window);
//           textFieldWindowAdded = false;
////           textFieldObserverButton.setText("Add " + TEXTFIELD_OBSERVER_BUTTON_TITLE);
//           setText("Add " + text2);
//        } else {
//        	primeThread.addObserver(window);
//        	textFieldWindowAdded = true;
////        	textFieldObserverButton.setText("Remove " + TEXTFIELD_OBSERVER_BUTTON_TITLE);
//        	setText("Remove " + text2);
//       }
//	}
}
