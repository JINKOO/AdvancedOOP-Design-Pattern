package week12_1_adapter_pattern;

/*
 * Duck ��ü�� ���ڶ� Turkey��ü�� ��� ����ؾ��ϴ� ��Ȳ�̶�� ����.
 * Duck, Turkey�� interface�� �ٸ��Ƿ� Turkey��ü�� �ٷ� ��� �� �� �� ����.
 * Adapter class�� �����Ͽ�, Turkey��ü�� Duck��ü�� Wrapp�Ѵ�.
 * 
 * �����Ű���� �ϴ�(client���� ���ϴ�) interface�� implements�Ѵ�.
 */
public class TurkeyAdapter implements Duck {
	
	private Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	@Override
	public void quack() {
		turkey.gobble();
	}
	
	@Override
	public void fly() {
		turkey.fly();
	}
}

