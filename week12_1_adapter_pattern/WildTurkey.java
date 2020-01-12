package week12_1_adapter_pattern;

/*
 * Turkey�� ������ class
 * �� ��ü�� Duck adapter�� ���Ͽ� Duck interface�� wrap�ȴ�. 
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
