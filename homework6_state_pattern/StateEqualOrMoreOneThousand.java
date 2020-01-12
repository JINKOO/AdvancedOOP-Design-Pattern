package homework6_state_pattern;

public class StateEqualOrMoreOneThousand implements State {

	MainWindow mainWindow;
	
	public StateEqualOrMoreOneThousand(MainWindow mainWindow) {
		// TODO Auto-generated constructor stub
		this.mainWindow = mainWindow;
	}

	@Override
	public void returnChanges() {
		// TODO Auto-generated method stub
		mainWindow.setState(mainWindow.getStateZero());
        mainWindow.setMsgText("" + mainWindow.getBalance() + "원을 반환합니다");
        mainWindow.setBalance(0);
        mainWindow.setBalanceText();
	}

	@Override
	public void selectBeverage() {
		// TODO Auto-generated method stub
		String msg = "음료를 내보냅니다. 배출구를 확인하세요.";
        mainWindow.setBalance(mainWindow.getBalance() - 1000);
        if (mainWindow.getBalance() > 0) {
            msg = msg + " 거스름돈 " + mainWindow.getBalance() + "원을 반환합니다.";
            mainWindow.setBalance(0);
        }
        mainWindow.setBalanceText();
        mainWindow.setMsgText(msg);
        mainWindow.setState(mainWindow.getStateZero());
	}

	@Override
	public void addHundred() {
		// TODO Auto-generated method stub
		mainWindow.setBalance(mainWindow.getBalance() + 100);
	}

	@Override
	public void addFiveHundred() {
		// TODO Auto-generated method stub
		mainWindow.setBalance(mainWindow.getBalance() + 500);
		
	}

	@Override
	public void addThousand() {
		// TODO Auto-generated method stub
		mainWindow.setBalance(mainWindow.getBalance() + 1000);
	}
	
	
}
