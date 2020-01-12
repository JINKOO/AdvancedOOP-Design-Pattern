package week13_2_state_pattern;

public interface State {

	public void insertQuarter();
	public void ejectQuarter();
	public void dispense();
	public void turnCrank();
}
