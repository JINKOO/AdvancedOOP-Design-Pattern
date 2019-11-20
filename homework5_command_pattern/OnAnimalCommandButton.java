package homework5_command_pattern;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class OnAnimalCommandButton extends CommandButton implements Command {

	private MainWindow mainWindow;
	private ImageIcon imageIcon;
	private ImageIcon prevImageIcon;
	
	public OnAnimalCommandButton(String title, MainWindow mainWindow, ImageIcon imageIcon) {
		// TODO Auto-generated constructor stub
		super(title);
		this.mainWindow = mainWindow;
		this.imageIcon = imageIcon;
	}
	
	@Override
	public void execute(JLabel label) {
		
		if(MainWindow.imageIcon == null)
			MainWindow.imageIcon = this.imageIcon;
		prevImageIcon = mainWindow.getImageIcon();
		MainWindow.imageIcon = this.imageIcon;
		label.setIcon(imageIcon);
	}
	
	@Override
	public void undo(JLabel label) {
		
		System.out.println("»£√‚µ»" + this.getClass().toString());
		System.out.println(prevImageIcon.toString());
		
		if(prevImageIcon.equals(MainWindow.sheepIcon))
			label.setIcon(MainWindow.sheepIcon);
		else if(prevImageIcon.equals(MainWindow.dogIcon))
			label.setIcon(MainWindow.dogIcon);
		else if(prevImageIcon.equals(MainWindow.hedgehogIcon))
			label.setIcon(MainWindow.hedgehogIcon);
		else if(prevImageIcon.equals(MainWindow.catIcon))
			label.setIcon(MainWindow.catIcon);
	}
}
