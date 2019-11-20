package homework4_factory_singleton_pattern;

import javax.swing.*;
import java.awt.event.WindowListener;

public abstract class FrameWindow {
    
	private JFrame frame;
	//�߰�
	private String title;
	
    public FrameWindow(String title, int x, int y, int width, int height) {
        this.title = title;
    	frame = createWindow(title, x, y, width, height);
    }

    public FrameWindow(String title, int x, int y, int width, int height, WindowListener lis) {
        this.title = title;
    	frame = createWindow(title, x, y, width, height);
        frame.addWindowListener(lis);
    }

    public JFrame createWindow(String title, int x, int y, int width, int height) {
        JFrame frame;
        frame = new JFrame(title);
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
    
    public String getTitle() {
    	return this.title;
    }

    public abstract JPanel createPanel(int width, int height);
}
