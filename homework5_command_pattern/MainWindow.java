package homework5_command_pattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/*
 * Invoker에 해당하는 class이다. 
 */
public class MainWindow extends FrameWindow implements ActionListener {

	private static final int X = 250;
	private static final int Y = 100;
	private static final int WIDTH = 600;
	private static final int HEIGHT = 600;
	private static final int NUM_BUTTONS = 5;
	private static final int BUTTON_HEIGHT = 100;

//	private JButton[] buttons;
	private CommandButton[] buttons;
	private String[] buttonTitles = { "sheep", "cat", "hedgehog", "dog", "Undo" };
	private ImageIcon[] imageIcons;
	private JLabel label;
	
	public static ImageIcon sheepIcon;
	public static ImageIcon dogIcon;
	public static ImageIcon hedgehogIcon;
	public static ImageIcon catIcon;
	
	public static ImageIcon imageIcon;
	
	//undo
	private Command undoCommand;

	public MainWindow(String title) {
		
		super();
		imageIcons = new ImageIcon[buttonTitles.length];
		Command noCommand = new NoCommand();
		for (int i = 0; i < buttonTitles.length; i++) {
			imageIcons[i] = new ImageIcon(buttonTitles[i] + ".jpg");	
		}
		sheepIcon = imageIcons[0];
		catIcon = imageIcons[1];
		hedgehogIcon = imageIcons[2];
		dogIcon = imageIcons[3];
		undoCommand = noCommand;		
		createWindow(title, X, Y, WIDTH, HEIGHT);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	/*
	 * button 생성 부분을 고쳐야 한다. 배열을 사용해야 한다.
	 */
	public JPanel createPanel(int width, int height) {

		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		buttonPanel.setPreferredSize(new Dimension(width, BUTTON_HEIGHT));
		buttons = new CommandButton[NUM_BUTTONS];

		for (int i = 0; i < NUM_BUTTONS; i++) {
			if (i == 0) 
				buttons[i] = new SheepOnButtonCommand(buttonTitles[i], this, imageIcons[i]);
			else if (i == 1) 
				buttons[i] = new CatOnButtonCommand(buttonTitles[i], this, imageIcons[i]);
			else if (i == 2) 
				buttons[i] = new HedgehogOnButtonCommand(buttonTitles[i], this, imageIcons[i]);
			else if (i == 3) 
				buttons[i] = new DogOnButtonCommand(buttonTitles[i], this, imageIcons[i]);
			else
				buttons[i] = new UndoButtonCommand(buttonTitles[i]);
			
			buttons[i].setProperties(this, width / NUM_BUTTONS, BUTTON_HEIGHT);
			buttonPanel.add(buttons[i]);
		}

		panel.add(buttonPanel);
		label = new JLabel();
		label.setPreferredSize(new Dimension(width, HEIGHT - BUTTON_HEIGHT));
		panel.add(label, BorderLayout.SOUTH);
		return panel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
       
		if (e.getSource() instanceof Command) {
			Command command = (Command)e.getSource();
			command.execute(label);
			undoCommand = command;
		}
		
		else 
			undoCommand.undo(label);
	}
	
	
	public ImageIcon getImageIcon() {
		System.out.println("MainWindow static 변수에 저장된 : " + imageIcon.toString());
		return imageIcon;
	}
}
