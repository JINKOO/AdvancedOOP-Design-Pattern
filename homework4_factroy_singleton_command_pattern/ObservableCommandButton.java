package homework4_factroy_singleton_command_pattern;

/*
 * TextFieldWindowButtonCommand, LabelWindowButtonCommand class��
 * �߻�ȭ�� class�̴�.
 * StopRunningButtonCommand�� ���� ó���Ѵ�.
 */
public class ObservableCommandButton extends CommandButton implements Command {

	private String text2;
	private Subject primeThread;
	private WindowProduct window;
	private boolean added = true;

	public ObservableCommandButton(String text1, String text2, Subject primeThread, WindowProduct window) {
		// TODO Auto-generated constructor stub
		super(text1 + text2);
		this.primeThread = primeThread;
		this.window = window;
		this.text2 = text2;
	}

	@Override
	public void execute() {
		if (added) {
			primeThread.removeObserver(window);
			added = false;
			setText("Add " + text2);
		} else {
			primeThread.addObserver(window);
			added = true;
			setText("Remove " + text2);
		}
	}
}
