package week04_1_observer_pattern;

import java.util.ArrayList;

public class WeatherData implements Subject {

	
	private float temperature;
	private float humidity;
	private float pressure;
	
	//Version1���� �ʿ��� Class�� ��� ������
	private CurrentConditionsDisplay current;
	private StatisticsDisplay statistic;
	private ThirdPartyDisplay thirdParty;
	
	//Version2���� �ʿ��� ArrayList<>
	private ArrayList<Observer> observers;
	
	public WeatherData() {
		// TODO Auto-generated constructor stub
//		this.current = new CurrentConditions();
//		this.statistic = new StatisticsDisplay();
//		this.thirdParty = new ThirdPartyDisplay();
		
		this.observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0)
			observers.remove(i);
	}
	
	@Override
	public void notifyObservers() {
		
		for(int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementChanged() {
		//�̹� ������ �Լ��� ���Ͽ� �ֽ� �������� �����´�.
//		float temp = getTemperature();
//		float humidity = getHumidity();
//		float pressure = getPressure();
//		
//		/* Version1 display����
//		 * ���⼭�� ��ü�� ��üȭ ���� ����Ѵ�. 
//		 * ���ο� ���÷��� �Լ� �߰� or ���� �Ϸ��� ���� �Լ��� ��� �����ؾ��Ѵ�.
//		 * ���� ���� �����
//		 * ���� �̷��� ��üȭ�� ��ü���� ĸ��ȭ�� �ʿ䰡 �ִ�. 
//		 */
//		current.update(temp, humidity, pressure);
//		statistic.update(temp, humidity, pressure);
//		thirdParty.update(temp, humidity, pressure);
		
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		measurementChanged();
	}
	
	public float getTemperature() {
		return this.temperature;
	}
	
	public float getHumidity() {
		return this.humidity;
	}
	
	public float getPressure() {
		return this.pressure;
	}
	
	public ArrayList<Observer> getObservers() {
		return this.observers;
	}
}
