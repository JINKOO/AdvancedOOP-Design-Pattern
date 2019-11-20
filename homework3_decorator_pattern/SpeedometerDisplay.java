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
	 * ���� ������ width, height�� 
	 */
	public SpeedometerDisplay(Display display, int WIDTH, int HEIGHT ) {
		// TODO Auto-generated constructor stub
		super(display, WIDTH, HEIGHT);
		this.display = display;
	}
	
	/*
	 * å���̸� ����
	 * HudDisplay�� �Ȱ� Speedo�� �ȴ´�.
	 * �� Speedo �г��� Hud���� Ŀ���Ѵ�.
	 * 
	 * getHeight()�� Override�ؾ��Ѵ�.
	 * �� ũ�� ������ �ϴϱ�.
	 * 
	 */
	@Override
	public JPanel create() {
		
		//���ο� Panel�� �����
		panel = new JPanel();
//		panel.setBackground(Color.green);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		//���� display�� ���� + ������ ���� = ���ο� ����(���ο� panel�� ����)
		//���⼭ getHeight()�� Speedo�� getHeight()
		//getWidth()�� �����ϴ�.
		//��� class�� getHeight()���� �� �ľ��ؾ� �Ѵ�. 
        panel.setPreferredSize(new Dimension(getWidth(), this.getHeight()));
        
        // �̹� �־��� Panel�� ������ ���δ�. 
        panel.add(display.create());
        
//        display.show();
        
        labelPanel = new LabelPanel();
        //�ڱ� �ڽŰ� �ϱ� super.getHeight();
        panel.add(labelPanel.createPanel(super.getWidth(), super.getHeight()));
		
        //���������� ������� ��, hud�� �߰��� �г��� ���ſ� ���ļ� return.
        return panel;
	}
	
	/*
	 * ���� ���� panel�� ����
	 * �� ���� panel�� ����  + ���ο� panel�� ����.
	 * 
	 * ���� display�� height + ���� ����(�����ڷ� ���� width, height).
	 * Starbuzz���� getDescription()�� �����.
	 */
	@Override
	public int getHeight() {
		return display.getHeight() + super.getHeight();
	}
		
	@Override
    public void show() {
		//���� display�� label�����ֱ�
		display.show();
		String speedInfo = "Speed: " + currentSpeed; 
		labelPanel.updateText(speedInfo);
	}
}
