package week01_2_java_basic;

/*
  interface에서
  default Method 사영 예제
 */
public interface IValue {

	public static final int VALUE = 12;
	
	default public int getValue() {
		return VALUE;
	}
}
