package homework5_command_pattern;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class CommandButton extends JButton {

	public CommandButton(String title) {
		// TODO Auto-generated constructor stub
		super(title);
	}
	
	public void setProperties(ActionListener listener, int width, int height) {
		addActionListener(listener);
		Dimension buttonDimension = new Dimension(width, height);
		setMaximumSize(buttonDimension);
		setMinimumSize(buttonDimension);
		setPreferredSize(buttonDimension);
	}
}
