package homework4_factroy_singleton_command_pattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* 
 * 1. Observer Pattern 적용
 * 
 * 2. Factory Pattern 적용
 *   각 window 생성 부분 적용
 *   MainWindow는 Client이면서 Main Class이다.
 * 
 * 3. Command Pattern을 적용한다. 
 *   각 버튼 생성에 적용 시키고자 한다. 
 *   MainWindow = client
 *   현재 Main Class는 ActionListener를 구현하고있다.
 * 
 *   ActionListener의 버튼이 눌렸을 때, actionPerformed()를 Override하여
 *   각 버튼이 눌렸을 경우를 처리하고 있다. 
 *   현재 각 버튼이 눌렸을 경우를 직접 처리하고 있는 데, 
 *   이 부분을 캡슐화 시켜 client에게는 하나의 interface를 적용시키고자 한다.  
 * 
 *   현재 버튼은 총 3개이다. 따라서 command pattern을 따르려면
 *   commend interface와 이를 구현 하는 , 각 버튼별 class가 있어야 한다. 
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
   
    //Version1. 각 버튼을 commandButton으로 추상화
    /*
    private CommandButton textFieldObserverButton;
    private CommandButton labelObserverButton;
    private CommandButton stopButton;
    */
    
    //Version2. 버튼을 배열 속성으로 처리하기.
    private CommandButton[] onCommands;

    private PrimeObservableThread primeThread;

    private boolean labelWindowAdded = true;
    private boolean textFieldWindowAdded = true;

    private WindowProduct textFieldWindow;
    private WindowProduct labelWindow;
    private Creator creator;
    
    /*
     * 현재 생성자에서 버튼 생성이 이루어진다.
     * 먼저 해야할 일은 버튼 생성 코드 생성자에서  분리 시키는 것이다. 
     * 
     * 즉, super()를 통하여 FrameWindow의 생성자에서 createWindow()를 부르고
     * createWindow()안에서 createPanel()을 호출,
     * main class에서 override한 createPanel()안에서 createButton()을 호출 한다.
     * 
     * command pattern을 적용시키려면 이 부분을 고쳐야한다.
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
        //1. TextFieldWinodwButton 생성.
        textFieldObserverButton = new TextFieldWindowButtonCommand("Remove", TEXTFIELD_OBSERVER_BUTTON_TITLE, primeThread, textFieldWindow);
//        createButton(textFieldObserverButton, this, width, height);
        textFieldObserverButton.setProperties(this, width, height);
        panel.add(textFieldObserverButton);
        
        //2. LableWindowButton 생성.
        labelObserverButton = new LabelWindowButtonCommand("Remove", LABEL_OBSERVER_BUTTON_TITLE, primeThread, labelWindow);
//        createButton(labelObserverButton, this, width, height);
        labelObserverButton.setProperties(this, width, height);
        panel.add(labelObserverButton);
        
        //3. StopButton 생성.
        stopButton = new StopButtonCommand(STOP_THREAD_BUTTON_TITLE, primeThread);
//        createButton(stopButton, this, width, height);
        stopButton.setProperties(this, width, height);
        panel.add(stopButton);
        */
        return panel;
    }

    /*
     * 
     * ActionListener Class의 actionPerforemd()를 Override한다.
     * 이 함수가 각 버튼 별 처리를 담당하고 있는데
     * 이 함수에 command Pattern을 적용 시킨다. 
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
