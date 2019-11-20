package homework4_factroy_singleton_command_pattern;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CommandButton extends JButton {

	public CommandButton(String text) {
		// TODO Auto-generated constructor stub
		super(text);
	}
	
	public void setProperties(ActionListener listener, int width, int height) {
        addActionListener(listener);
        Dimension buttonDimension = new Dimension(width, height / 3);
        setMaximumSize(buttonDimension);
        setMinimumSize(buttonDimension);
        setPreferredSize(buttonDimension);
    }
	
//	@Override
//	public abstract void execute();
}
