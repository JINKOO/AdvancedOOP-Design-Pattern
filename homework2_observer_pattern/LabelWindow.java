package homework2_observer_pattern;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LabelWindow extends FrameWindow implements Observer{

    private JLabel label;
    private int primeNumber;
    private Subject primeThread;
    
    public LabelWindow(Subject primeThread, String title, int x, int y, int width, int height) {
        super(title, x, y, width, height);
        this.primeThread = primeThread;
        this.primeThread.registerObserver(this);
    }

    public void updateText(String msg) {
        label.setText(msg);
        label.validate();
    }

    @Override
    public JPanel createPanel(int width, int height) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        label = new JLabel();
        panel.add(label);
        panel.setPreferredSize(new Dimension(width, height));
        return panel;
    }
    
    @Override
    public void update(int primeNumber) {
    	this.primeNumber = primeNumber;
    	updateText("" + this.primeNumber);
    }
}
