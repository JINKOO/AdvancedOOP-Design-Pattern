package week13_1_state_pattern;

public class GumbleMachineV1 {

	final static int SOLD_OUT = 0;
	final static int NO_QUARTER = 1;
	final static int HAS_QUARTER = 2;
	final static int SOLD = 3;
	
	int state = SOLD_OUT;
	int count = 0;
	
	public GumbleMachineV1(int count) {
		// TODO Auto-generated constructor stub
		this.count = count;
		if(count > 0)
			state = NO_QUARTER;
	}
	
	public void insertQuarter() {
		if(state == HAS_QUARTER)
			System.out.println("������ �Ѱ��� �־��ּ���");
		else if(state == SOLD_OUT)
			System.out.println("���� �Ǿ����ϴ�. ���� ��ȸ�� �̿��� �ּ���");
		else if(state == SOLD)
			System.out.println("��ø� ��ٷ� �ּ���..�˸��̰� ������ ���Դϴ�.");
		else if(state == NO_QUARTER) {
			state = HAS_QUARTER;
			System.out.println("������ ���� �Ǿ����ϴ�.");
		}
	}
	
	public void ejectQuarter() {
		if(state == HAS_QUARTER) {
			System.out.println("������ ��ȯ�˴ϴ�.");
			state = NO_QUARTER;
		} 
		else if(state == NO_QUARTER)
			System.out.println("������ ���� ���ּ���");
		else if(state == SOLD)
			System.out.println("�˸��̸� �̹� �̾ҽ��ϴ�.");
		else if(state == SOLD_OUT) 
			System.out.println("������ �������� �ʾҽ��ϴ�. ������ ��ȯ���� �ʽ��ϴ�.");
	}
	
	public void trunkCrank() {
		if(state == SOLD)
			System.out.println("�����̴� �ѹ��� �����ּ���");
		else if(state == SOLD_OUT)
			System.out.println("���� �Ǿ����ϴ�. ���� ��ȸ��..");
		else if(state == NO_QUARTER)
			System.out.println("������ �־��ּ���");
		else if(state == HAS_QUARTER) {
			System.out.println("�����̸� ���Ƚ��ϴ�.");
			state = SOLD;
			dispense();
		}
	}
	
	public void dispense() {
		if(state == SOLD) {
			System.out.println("�˸��̰� ������ �ֽ��ϴ�.");
			count = count - 1;
			if(count == 0) {
				System.out.println("���̻� �˸��̰� �����ϴ�.");
				state = SOLD_OUT;
			}
			else {
				state = NO_QUARTER;
			}
		}
		else if(state == NO_QUARTER)
			System.out.println("������ �־��ּ���");
		else if(state == SOLD_OUT)
			System.out.println("���� �Դϴ�.");
		else if(state == HAS_QUARTER)
			System.out.println("�˸��̰� ���� �� �����ϴ�.");
	}
}
