package homework2_observer_pattern;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldWindow extends FrameWindow implements Observer {

    private JTextField textField;
    private Subject primeThread;
    private int primeNumber;

   
    public TextFieldWindow(Subject primeThread, String title, int x, int y, int width, int height) {
        super(title, x, y, width, height);
        this.primeThread = primeThread;
        this.primeThread.registerObserver(this);
    }

    public void updateText(String msg) {
        textField.setText(msg);
        textField.validate();
    }
    
    @Override
    public void update(int primeNumber) {
    	this.primeNumber = primeNumber;
    	updateText("" + this.primeNumber);
    }

    @Override
    public JPanel createPanel(int width, int height) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        textField = new JTextField();
        panel.add(textField);
        panel.setPreferredSize(new Dimension(width, height));
        return panel;
    }
}
