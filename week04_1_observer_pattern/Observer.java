package week04_1_observer_pattern;

/*
 * Observer interface를 구현하는 class들을
 * 여러개가 될 수 있다. 
 */
public interface Observer {

	//파라미터들은 state에 해당한다. 
	public void update(float temperature, float humidity, float pressure);
	
}
