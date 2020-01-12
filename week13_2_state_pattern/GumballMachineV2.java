package week13_2_state_pattern;

/*
 * Context Class�� �ش��Ѵ�.
 * State Pattern������ ���� ���¿� ���� ����
 * �ش� ���� Class���� ��� �����Ѵ�.
 * 
 * Client���� ���� ��ü�� �����Ͽ� �Ѱ��ִ� ���� �ƴ϶�
 * ���¸� �����ϰ� �Ǵ� ��Ģ��� ���¸� ��ȭ�ϵ��� ���� �ߴٸ�
 * State pattern������ Context ���°� �ڵ����� ��� �ٲ�� �ȴ�.
 * 
 */
public class GumballMachineV2 {

	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	
	State state = soldOutState;
	int count = 0;
	
	public GumballMachineV2(int numberGumBalls) {
		// TODO Auto-generated constructor stub
		this.soldOutState = new SoldOutState(this);
		this.noQuarterState = new NoQuarterState(this);
		this.hasQuarterState = new HasQuarterState(this);
		this.soldState = new SoldState(this);
		this.count = numberGumBalls;
		if(numberGumBalls > 0)
			state = noQuarterState;
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void releaseBall() {
		System.out.println("GumBall is rolling out the slot...");
		if(count != 0)
			count = count - 1;
	}
	
	public int getGumballCount() {
		return this.count;
	}
	
	public State getHasQuarterState() {
		return this.hasQuarterState;
	}
	
	public State getSoldState() {
		return this.soldState;
	}
	
	public State getSoldOutState() {
		return this.soldOutState;
	}
	
	public State getNoQuarterState() {
		return this.noQuarterState;
	}
}
