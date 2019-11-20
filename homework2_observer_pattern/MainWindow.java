package homework2_observer_pattern;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class MainWindow extends FrameWindow implements ActionListener {
	
    private static final String MAIN_TITLE = "Main Window";
    private static final String TEXTFIELD_WINDOW_TITLE = "TextField Window";
    private static final String LABEL_WINDOW_TITLE = "Label Window";
    private static final String TEXTFIELD_OBSERVER_BUTTON_TITLE = "Remove TextField Window Observer";
    private static final String LABEL_OBSERVER_BUTTON_TITLE = "Remove Label Window Observer";
    
    //add
    private static final String CLICKED_TEXTFIELD_OBSERVER_BUTTON_TITLE = "Add TextField Window Observer";
    private static final String CLICKED_LABEL_OBSERVER_BUTTON_TITLE = "Add Label Window Observer";
    
    private static final String STOP_THREAD_BUTTON_TITLE = "Stop Generating Prime Number";
    private static final int X = 250;
    private static final int Y = 100;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 200;
    private static final int GAP = 50;

    private JButton stopButton;
    private JButton updateTextFieldObserverButton;
    private JButton updateLabelObserverButton;
    private PrimeObservableThread primeThread;
    private TextFieldWindow textFieldWindow;
    private LabelWindow labelWindow;
    
    public MainWindow(String title) {
		// TODO Auto-generated constructor stub
    	super(title, X, Y, WIDTH, HEIGHT);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                primeThread.stopRunning();
                textFieldWindow.closeWindow();
                labelWindow.closeWindow();
                System.exit(0);
            }
        });
        primeThread = new PrimeObservableThread();
        textFieldWindow = new TextFieldWindow(primeThread, TEXTFIELD_WINDOW_TITLE, X, Y + HEIGHT + GAP, WIDTH, HEIGHT);
        labelWindow = new LabelWindow(primeThread, LABEL_WINDOW_TITLE, X, Y + (HEIGHT + GAP) * 2, WIDTH, HEIGHT);
        primeThread.run();
	}
    
    @Override
    public JPanel createPanel(int width, int height) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setPreferredSize(new Dimension(width, height));
        updateTextFieldObserverButton = createButton(TEXTFIELD_OBSERVER_BUTTON_TITLE, this, width, height);
        panel.add(updateTextFieldObserverButton);
        updateLabelObserverButton = createButton(LABEL_OBSERVER_BUTTON_TITLE, this, width, height);
        panel.add(updateLabelObserverButton);
        stopButton = createButton(STOP_THREAD_BUTTON_TITLE, this, width, height);
        panel.add(stopButton);
        return panel;
    }
    
    
    //add 
    public void registerOrRemoveObserver(Observer o, JButton button, String initialButtonTitle, String clickedButtonTitle) {
	   
	   if(button.getText().equals(initialButtonTitle)) {
		   button.setText(clickedButtonTitle);
		   primeThread.removeObserver(o);
	   }
	   else {
		   button.setText(initialButtonTitle);
		   primeThread.registerObserver(o);
	   }
	   
    }
    
    
    //modify
    @Override
    public void actionPerformed(ActionEvent e) {
    	
        if (e.getSource() == updateTextFieldObserverButton)  	
        	registerOrRemoveObserver(textFieldWindow, updateTextFieldObserverButton, 
        			TEXTFIELD_OBSERVER_BUTTON_TITLE, CLICKED_TEXTFIELD_OBSERVER_BUTTON_TITLE);
        
 
        else if (e.getSource() == updateLabelObserverButton) 
        	registerOrRemoveObserver(labelWindow, updateLabelObserverButton, 
        			LABEL_OBSERVER_BUTTON_TITLE, CLICKED_LABEL_OBSERVER_BUTTON_TITLE);
        
        
        else if (e.getSource() == stopButton) 
            primeThread.stopRunning();
        
    }
    
    private JButton createButton(String text, ActionListener listener, int width, int height) {
        JButton button = new JButton(text);
        button.addActionListener(listener);
        Dimension buttonDimension = new Dimension(width, height / 3);
        button.setMaximumSize(buttonDimension);
        button.setMinimumSize(buttonDimension);
        button.setPreferredSize(buttonDimension);
        return button;
    }
    

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow(MainWindow.MAIN_TITLE);
    }
}
