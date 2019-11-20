package homework4_factroy_singleton_command_pattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* 
 * 1. Observer Pattern ����
 * 
 * 2. Factory Pattern ����
 *   �� window ���� �κ� ����
 *   MainWindow�� Client�̸鼭 Main Class�̴�.
 * 
 * 3. Command Pattern�� �����Ѵ�. 
 *   �� ��ư ������ ���� ��Ű���� �Ѵ�. 
 *   MainWindow = client
 *   ���� Main Class�� ActionListener�� �����ϰ��ִ�.
 * 
 *   ActionListener�� ��ư�� ������ ��, actionPerformed()�� Override�Ͽ�
 *   �� ��ư�� ������ ��츦 ó���ϰ� �ִ�. 
 *   ���� �� ��ư�� ������ ��츦 ���� ó���ϰ� �ִ� ��, 
 *   �� �κ��� ĸ��ȭ ���� client���Դ� �ϳ��� interface�� �����Ű���� �Ѵ�.  
 * 
 *   ���� ��ư�� �� 3���̴�. ���� command pattern�� ��������
 *   commend interface�� �̸� ���� �ϴ� , �� ��ư�� class�� �־�� �Ѵ�. 
 * 
 */
public class MainWindow extends FrameWindow implements ActionListener {
	
    private static final String MAIN_TITLE = "Main Window";
    private static final String TEXTFIELD_WINDOW_TITLE = "TextField Window";
    private static final String LABEL_WINDOW_TITLE = "Label Window";
    private static final String TEXTFIELD_OBSERVER_BUTTON_TITLE = "TextField Window Observer";
    private static final String LABEL_OBSERVER_BUTTON_TITLE = "Label Window Observer";
    private static final String STOP_THREAD_BUTTON_TITLE = "Stop Generating Prime Number";
    private static final int X = 250;
    private static final int Y = 100;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 200;
    private static final int GAP = 50;

//    private JButton stopButton;
//    private JButton textFieldObserverButton;
//    private JButton labelObserverButton;
   
    //Version1. �� ��ư�� commandButton���� �߻�ȭ
    /*
    private CommandButton textFieldObserverButton;
    private CommandButton labelObserverButton;
    private CommandButton stopButton;
    */
    
    //Version2. ��ư�� �迭 �Ӽ����� ó���ϱ�.
    private CommandButton[] onCommands;

    private PrimeObservableThread primeThread;

    private boolean labelWindowAdded = true;
    private boolean textFieldWindowAdded = true;

    private WindowProduct textFieldWindow;
    private WindowProduct labelWindow;
    private Creator creator;
    
    /*
     * ���� �����ڿ��� ��ư ������ �̷������.
     * ���� �ؾ��� ���� ��ư ���� �ڵ� �����ڿ���  �и� ��Ű�� ���̴�. 
     * 
     * ��, super()�� ���Ͽ� FrameWindow�� �����ڿ��� createWindow()�� �θ���
     * createWindow()�ȿ��� createPanel()�� ȣ��,
     * main class���� override�� createPanel()�ȿ��� createButton()�� ȣ�� �Ѵ�.
     * 
     * command pattern�� �����Ű���� �� �κ��� ���ľ��Ѵ�.
     */
    public MainWindow(String title) {
    	
    	super();
        creator = WindowCreator.getInstance();
        textFieldWindow = creator.orderWindow(TEXTFIELD_WINDOW_TITLE, X, Y + HEIGHT + GAP, WIDTH, HEIGHT);
        labelWindow = creator.orderWindow(LABEL_WINDOW_TITLE, X, Y + (HEIGHT + GAP) * 2, WIDTH, HEIGHT);
        
        onCommands = new CommandButton[3];
        
        primeThread = new PrimeObservableThread();
        createWindow(title, X, Y, WIDTH, HEIGHT);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                primeThread.stopRunning();
                textFieldWindow.closeWindow();
                labelWindow.closeWindow();
                System.exit(0);
            }
        });

        primeThread.addObserver(textFieldWindow);
        primeThread.addObserver(labelWindow);
        primeThread.run();
    }

    @Override
    public JPanel createPanel(int width, int height) {
    	
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setPreferredSize(new Dimension(width, height));
          
        
        for(int i = 0; i<3; i++) {
        	if(i == 0) 
        		onCommands[i] = new TextFieldWindowButtonCommand("Remove", TEXTFIELD_OBSERVER_BUTTON_TITLE, primeThread, textFieldWindow);
        	else if(i == 1)
        		onCommands[i] = new LabelWindowButtonCommand("Remove", LABEL_OBSERVER_BUTTON_TITLE, primeThread, labelWindow);
        	else if(i == 2) 
        		onCommands[i] = new StopButtonCommand(STOP_THREAD_BUTTON_TITLE, primeThread);
        	
        	onCommands[i].setProperties(this, width, height);
        	panel.add(onCommands[i]);
        }
        
        /*
        //1. TextFieldWinodwButton ����.
        textFieldObserverButton = new TextFieldWindowButtonCommand("Remove", TEXTFIELD_OBSERVER_BUTTON_TITLE, primeThread, textFieldWindow);
//        createButton(textFieldObserverButton, this, width, height);
        textFieldObserverButton.setProperties(this, width, height);
        panel.add(textFieldObserverButton);
        
        //2. LableWindowButton ����.
        labelObserverButton = new LabelWindowButtonCommand("Remove", LABEL_OBSERVER_BUTTON_TITLE, primeThread, labelWindow);
//        createButton(labelObserverButton, this, width, height);
        labelObserverButton.setProperties(this, width, height);
        panel.add(labelObserverButton);
        
        //3. StopButton ����.
        stopButton = new StopButtonCommand(STOP_THREAD_BUTTON_TITLE, primeThread);
//        createButton(stopButton, this, width, height);
        stopButton.setProperties(this, width, height);
        panel.add(stopButton);
        */
        return panel;
    }

    /*
     * 
     * ActionListener Class�� actionPerforemd()�� Override�Ѵ�.
     * �� �Լ��� �� ��ư �� ó���� ����ϰ� �ִµ�
     * �� �Լ��� command Pattern�� ���� ��Ų��. 
     * 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	if(e.getSource() instanceof Command) {
    		Command command = (Command)e.getSource();
    		command.execute();
    	}
    }

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow(MainWindow.MAIN_TITLE);
    }
}
