package week13_2_state_pattern;

public class HasQuarterState implements State {

	GumballMachineV2 gumballMachine;
	
	public HasQuarterState(GumballMachineV2 gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("������ 1���� �־��ּ���");
	}
	
	@Override
	public void ejectQuarter() {
		System.out.println("������ ��ȯ�˴ϴ�.");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
	
	@Override
	public void dispense() {
		System.out.println("�˸��̰� ���� �� �����ϴ�.");
	}
	
	@Override
	public void turnCrank() {
		System.out.println("�����̸� �����̽��ϴ�.");
		gumballMachine.setState(gumballMachine.getSoldState());
	}
}
