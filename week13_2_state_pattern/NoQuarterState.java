package week13_2_state_pattern;

public class NoQuarterState implements State {

	GumballMachineV2 gumballMachine;
	
	public NoQuarterState(GumballMachineV2 gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("������ �����̽��ϴ�.");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}
	
	@Override
	public void ejectQuarter() {
		System.out.println("������ �־��ּ���");
	}
	
	@Override
	public void dispense() {
		System.out.println("������ �־��ּ���");
	}
	
	@Override
	public void turnCrank() {
		System.out.println("������ �־��ּ���");
	}
}
