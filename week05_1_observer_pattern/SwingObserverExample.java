package week05_1_observer_pattern;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {

	private JFrame frame;
	
	void go() {
		
		this.frame = new JFrame();
		JButton button = new JButton("정말 해도 될까?");
		
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
}
