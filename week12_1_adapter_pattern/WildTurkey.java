package week12_1_adapter_pattern;

/*
 * Turkey를 구현한 class
 * 이 객체는 Duck adapter로 인하여 Duck interface로 wrap된다. 
 */
public class WildTurkey implements Turkey {
	
	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		System.out.println("Gobble gobble");
	}
	
	@Override
	public void fly() {
		System.out.println("I' can't fly far away");
	}
}
