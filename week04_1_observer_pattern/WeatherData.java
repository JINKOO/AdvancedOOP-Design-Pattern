package week04_1_observer_pattern;

import java.util.ArrayList;

public class WeatherData implements Subject {

	
	private float temperature;
	private float humidity;
	private float pressure;
	
	//Version1에서 필요한 Class형 멤버 변수들
	private CurrentConditionsDisplay current;
	private StatisticsDisplay statistic;
	private ThirdPartyDisplay thirdParty;
	
	//Version2에서 필요한 ArrayList<>
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
		//이미 구현된 함수를 통하여 최신 측정값을 가져온다.
//		float temp = getTemperature();
//		float humidity = getHumidity();
//		float pressure = getPressure();
//		
//		/* Version1 display갱신
//		 * 여기서는 객체를 구체화 시켜 사용한다. 
//		 * 새로운 디스플레이 함수 추가 or 제거 하려면 여기 함수를 모두 수정해야한다.
//		 * 좋지 않은 방법임
//		 * 따라서 이러한 구체화된 객체들을 캡슐화할 필요가 있다. 
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
