package week04_1_observer_pattern;

/*
 * Observer interface�� �����ϴ� class����
 * �������� �� �� �ִ�. 
 */
public interface Observer {

	//�Ķ���͵��� state�� �ش��Ѵ�. 
	public void update(float temperature, float humidity, float pressure);
	
}
