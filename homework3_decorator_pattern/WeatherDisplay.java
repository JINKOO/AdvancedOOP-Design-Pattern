package homework3_decorator_pattern;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class WeatherDisplay extends DisplayDecorator {

	private Display display;
	private LabelPanel labelPanel;
	private JPanel panel;
	private int temperature = 20;
	private int humidity = 60;
	
	public WeatherDisplay(Display display, int WIDTH, int HEIGHT) {
		// TODO Auto-generated constructor stub
		super(display, WIDTH, HEIGHT);
		this.display = display;
	}
	
	@Override
	public JPanel create() {
		panel = new JPanel();
//		panel.setBackground(Color.BLUE);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setPreferredSize(new Dimension(getWidth(), this.getHeight()));
		
		panel.add(display.create());
//		display.show();
		
		labelPanel = new LabelPanel();
		panel.add(labelPanel.createPanel(getWidth(), super.getHeight()));
		
		return panel;
	}
	
	@Override
	public int getHeight() {
		return display.getHeight() + super.getHeight();
	}
	
	@Override
	public void show() {
		display.show();
		String weatherInfo = "Weather: 온도: " + temperature + ", 습도: " + humidity;
		labelPanel.updateText(weatherInfo);
	}
}
