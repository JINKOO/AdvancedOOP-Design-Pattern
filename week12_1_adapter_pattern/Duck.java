package week12_1_adapter_pattern;

/*
 * 교재 1장의 Duck interface를 사용
 * 여기 예제에서는 Target interface에 속한다.
 * 즉, 어떠한 interface로 wrap할 것인지에 대한 target
 */
public interface Duck {

	public void quack();
	public void fly();
}
