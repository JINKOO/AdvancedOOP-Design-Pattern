package week13_2_state_pattern;

public class SoldOutState implements State {

	GumballMachineV2 gumballMachine;
	
	public SoldOutState(GumballMachineV2 gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("�����Դϴ�..������ȸ�� �̿����ּ���");
	}
	
	@Override
	public void ejectQuarter() {
		System.out.println("���� ������ �����ϴ�.. ��ȯ���� �ʽ��ϴ�.");
	}
	
	@Override
	public void turnCrank() {
		System.out.println("�ش� �˸��̰� ���� �Ǿ����ϴ�... ���� ��ȸ��...");
	}
	
	@Override
	public void dispense() {
		System.out.println("�����Դϴ�.");
	}
}
