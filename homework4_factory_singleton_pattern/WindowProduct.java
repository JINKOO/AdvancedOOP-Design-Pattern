package homework4_factory_singleton_pattern;

import javax.swing.JPanel;

/*
 * Concrete Creator Class¿Ã¥Ÿ.
 */
public abstract class WindowProduct extends FrameWindow implements Observer{
	
	public WindowProduct(String title, int x, int y, int width, int height) {
		super(title, x, y, width, height);
	}
		
	@Override
	public void update(int n) {
		updateText(" " + n);
	}
	
	
	public abstract void updateText(String msg);
	
	public abstract JPanel createPanel(int width, int height);
	
}
