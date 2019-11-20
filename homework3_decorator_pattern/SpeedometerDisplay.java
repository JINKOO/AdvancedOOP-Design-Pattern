package homework3_decorator_pattern;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class SpeedometerDisplay extends DisplayDecorator {

	private Display display;
	private JPanel panel;
	private LabelPanel labelPanel;
	private int currentSpeed = 50;
	
	
	/*
	 * 여기 들어오는 width, height는 
	 */
	public SpeedometerDisplay(Display display, int WIDTH, int HEIGHT ) {
		// TODO Auto-generated constructor stub
		super(display, WIDTH, HEIGHT);
		this.display = display;
	}
	
	/*
	 * 책꽂이를 생성
	 * HudDisplay를 꽂고 Speedo를 꽂는다.
	 * 즉 Speedo 패널은 Hud보다 커야한다.
	 * 
	 * getHeight()는 Override해야한다.
	 * 더 크게 만들어야 하니까.
	 * 
	 */
	@Override
	public JPanel create() {
		
		//새로운 Panel을 만들고
		panel = new JPanel();
//		panel.setBackground(Color.green);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		//기존 display의 높이 + 내거의 높이 = 새로운 높이(새로운 panel의 높이)
		//여기서 getHeight()는 Speedo의 getHeight()
		//getWidth()는 동일하다.
		//어느 class의 getHeight()인지 잘 파악해야 한다. 
        panel.setPreferredSize(new Dimension(getWidth(), this.getHeight()));
        
        // 이미 있었던 Panel을 가져와 붙인다. 
        panel.add(display.create());
        
//        display.show();
        
        labelPanel = new LabelPanel();
        //자기 자신거 니까 super.getHeight();
        panel.add(labelPanel.createPanel(super.getWidth(), super.getHeight()));
		
        //최종적으로 만들어진 즉, hud를 추가한 패널을 내거와 합쳐서 return.
        return panel;
	}
	
	/*
	 * 새로 만든 panel의 높이
	 * 즉 기존 panel의 높이  + 새로운 panel의 높이.
	 * 
	 * 기존 display의 height + 나의 높이(생성자로 들어온 width, height).
	 * Starbuzz에서 getDescription()과 비슷함.
	 */
	@Override
	public int getHeight() {
		return display.getHeight() + super.getHeight();
	}
		
	@Override
    public void show() {
		//기존 display의 label보여주기
		display.show();
		String speedInfo = "Speed: " + currentSpeed; 
		labelPanel.updateText(speedInfo);
	}
}
