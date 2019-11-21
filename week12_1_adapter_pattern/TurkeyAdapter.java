package week12_1_adapter_pattern;

/*
 * Duck 객체가 모자라서 Turkey객체를 대신 사용해야하는 상황이라고 보자.
 * Duck, Turkey의 interface가 다르므로 Turkey객체를 바로 사용 할 수 는 없다.
 * Adapter class를 생성하여, Turkey객체를 Duck객체로 Wrapp한다.
 * 
 * 적용시키고자 하는(client에서 원하는) interface를 implements한다.
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

