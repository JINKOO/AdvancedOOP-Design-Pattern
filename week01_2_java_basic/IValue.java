package week01_2_java_basic;

/*
  interface����
  default Method �翵 ����
 */
public interface IValue {

	public static final int VALUE = 12;
	
	default public int getValue() {
		return VALUE;
	}
}
