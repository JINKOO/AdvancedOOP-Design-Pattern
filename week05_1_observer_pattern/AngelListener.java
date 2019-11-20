package week05_1_observer_pattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AngelListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println("안돼 나중에 분명 후회할거야");
	}
}
