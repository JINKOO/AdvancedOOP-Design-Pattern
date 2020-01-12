package week13_2_state_pattern;

/*
 * Context Class에 해당한다.
 * State Pattern에서는 현재 상태에 관한 것을
 * 해당 상태 Class에게 모두 위임한다.
 * 
 * Client에서 전략 객체를 지정하여 넘겨주는 것이 아니라
 * 상태를 변경하게 되는 규칙대로 상태를 변화하도록 구현 했다면
 * State pattern에서는 Context 상태가 자동으로 계속 바뀌게 된다.
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
