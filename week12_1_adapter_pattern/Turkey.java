package week12_1_adapter_pattern;

/*
 * 새로 등장한 가금류.
 * 여기서는 오리의 탈을 쓴 칠면소
 * 오리처럼 걷고, 꽥꽥거린다면 반드시 오리인가..???
 * 
 * 현재 clinet가 사용하고자 하는 interface
 * Turkey객체는 adaptee에 해당한다. 
 * 즉 Duck으로 변환된다. 
 */
public interface Turkey {
	public void gobble();    //칠면조는 꽥꽥거리지 않는다.
	public void fly();       //칠면조는 날 수 도 있다. 
}
