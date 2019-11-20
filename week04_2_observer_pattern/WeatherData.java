package week04_2_observer_pattern;

import java.util.Observable;

/*
 * ������ subject interface�� �����ؾ��Ѵ�.
 * ���⼭�� java�� built-in Observable�� ��ӹ޾� ����Ѵ�.
 */
public class WeatherData extends Observable {

	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		
	}
	
	public void measurementsChanged() {
		//Observable Class���� �������ִ� �޼ҵ��̴�. 
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
