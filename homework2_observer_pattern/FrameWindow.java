package homework2_observer_pattern;

import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class FrameWindow {

	private JFrame frame;
	
	public FrameWindow(String title, int x, int y, int width, int height) {
		// TODO Auto-generated constructor stub
		this.frame = createWindow(title, x, y, width, height);
	}
	
	public FrameWindow(String title, int x, int y, int width, int height, WindowListener lis) {
		// TODO Auto-generated constructor stub
		frame = createWindow(title, x, y, width, height);
		frame.addWindowListener(lis);
	}
	
	public JFrame createWindow(String title, int x, int y, int width, int height) {
		
		JFrame frame = new JFrame(title);
        frame.setBounds(x, y, width, height);
        JPanel panel = createPanel(width, height);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

		return frame;
	}
	
	public void closeWindow() {
		frame.setVisible(false);
		frame.dispose();
	}
	
	public void addWindowListener(WindowListener lis) {
		frame.addWindowListener(lis);
	}
	
	
	public abstract JPanel createPanel(int width, int height);
	
}
