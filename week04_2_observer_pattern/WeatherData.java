package week04_2_observer_pattern;

import java.util.Observable;

/*
 * 원래는 subject interface를 구현해야한다.
 * 여기서는 java의 built-in Observable을 상속받아 사용한다.
 */
public class WeatherData extends Observable {

	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		
	}
	
	public void measurementsChanged() {
		//Observable Class에서 제공해주는 메소드이다. 
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		measurementsChanged();
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
}
