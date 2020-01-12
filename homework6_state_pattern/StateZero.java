package homework6_state_pattern;

public class StateZero implements State{

	MainWindow mainWindow;
	
	public StateZero(MainWindow mainWindow) {
		this.mainWindow = mainWindow;
	}
	
		
	@Override
	public void returnChanges() {
		mainWindow.setMsgText("");
	}
	
	@Override
	public void selectBeverage() {
		mainWindow.setMsgText("돈을 넣은 후에 눌러주세요");
	}


	@Override
	public void addHundred() {
		// TODO Auto-generated method stub
		mainWindow.setBalance(mainWindow.getBalance() + 100);
		mainWindow.setState(mainWindow.getStateLessFiveHunderd());
	}


	@Override
	public void addFiveHundred() {
		// TODO Auto-generated method stub
		mainWindow.setBalance(mainWindow.getBalance() + 500);
		mainWindow.setState(mainWindow.getStateFiveHundred());
		
	}

	@Override
	public void addThousand() {
		// TODO Auto-generated method stub
		mainWindow.setBalance(mainWindow.getBalance() + 1000);
		mainWindow.setState(mainWindow.getStateEqualOrMoreOneThousand());
	}
}
