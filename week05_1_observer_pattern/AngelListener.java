package week05_1_observer_pattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AngelListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println("�ȵ� ���߿� �и� ��ȸ�Ұž�");
	}
}
