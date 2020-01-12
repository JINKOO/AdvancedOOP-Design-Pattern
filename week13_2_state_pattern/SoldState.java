package week13_2_state_pattern;

public class SoldState implements State {

	GumballMachineV2 gumballMachine;
	
	public SoldState(GumballMachineV2 gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("��ø� ��ٷ� �ּ���.. �˸��̰� ������ �ֽ��ϴ�.");
	}
	
	@Override
	public void ejectQuarter() {
		System.out.println("�̹� �˸��̸� �̾Ҿ��ϴ�.");
	}
	
	@Override
	public void turnCrank() {
		System.out.println("�����̴� �ѹ��� �����ּ���");
	}
	
	@Override
	public void dispense() {
		gumballMachine.releaseBall();
		if(gumballMachine.getGumballCount() > 0)
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		else {
			System.out.println("OOps..out of ball");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
}
