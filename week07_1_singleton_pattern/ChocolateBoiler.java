package week07_1_singleton_pattern;

public class ChocolateBoiler {

	private static ChocolateBoiler uniqueInstance;
	private boolean empty;
	private boolean boiled;
	private static int count;
	
	//보일러는 비어있을 때만 동작한다.
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
	
	//비어있을 때만 재료를 넣는다.
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
		}
	}
	/*
	 * 보일러가 가득 차있고, 다 끓여진 상태에서만
	 * 보일러에 있는 재료를 다음 단계로 넘기고, 보일러를 비운다.
	 */
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			//끓인 재료를 다음 단계로 넘긴다.
			empty = true;
		}
	}
	
	/*
	 * 보일러가 가득 차있고, 아직 끓지 않은 상태이면 끓인다.
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
