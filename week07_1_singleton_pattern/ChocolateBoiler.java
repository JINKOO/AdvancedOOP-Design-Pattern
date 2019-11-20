package week07_1_singleton_pattern;

public class ChocolateBoiler {

	private static ChocolateBoiler uniqueInstance;
	private boolean empty;
	private boolean boiled;
	private static int count;
	
	//���Ϸ��� ������� ���� �����Ѵ�.
	private ChocolateBoiler() {
		this.empty = true;
		this.boiled = false;
	}
	
	public static ChocolateBoiler getInstance() {
		if(uniqueInstance == null) {
			count++;
			uniqueInstance = new ChocolateBoiler();
		}
		return uniqueInstance;
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
	
	//������� ���� ��Ḧ �ִ´�.
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
		}
	}
	/*
	 * ���Ϸ��� ���� ���ְ�, �� ������ ���¿�����
	 * ���Ϸ��� �ִ� ��Ḧ ���� �ܰ�� �ѱ��, ���Ϸ��� ����.
	 */
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			//���� ��Ḧ ���� �ܰ�� �ѱ��.
			empty = true;
		}
	}
	
	/*
	 * ���Ϸ��� ���� ���ְ�, ���� ���� ���� �����̸� ���δ�.
	 */
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}
	
	public static int getCount() {
		return count;
	}
}
