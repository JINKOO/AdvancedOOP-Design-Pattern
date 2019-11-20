package homework3_decorator_pattern;

import java.awt.Color;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class TimeDisplay extends DisplayDecorator {

	private Display display;
	private JPanel panel;
	private LabelPanel labelPanel;
	
	public TimeDisplay(Display display, int WIDTH, int HEIGHT) {
		super(display, WIDTH, HEIGHT);
		this.display = display;
	}
	
	@Override
	public JPanel create() {
		panel = new JPanel();
//		panel.setBackground(Color.RED);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setPreferredSize(new Dimension(display.getWidth(), display.getHeight()));
        // 부모 패널 Add
        panel.add(display.create());
        display.show();
        labelPanel = new LabelPanel();
        panel.add(labelPanel.createPanel(getWidth(), getHeight()));
       
        return panel;
		
	}
	
	@Override
	public void show() {
		Calendar cal = Calendar.getInstance();
		String dateInfo = "Date: " + cal.getTime().toString();
		labelPanel.updateText(dateInfo);
	}
}
