package week04_2_observer_pattern;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private Observable observable;
	private float temperature;
	private float humidity;
	
	/*
	 * Subject�� �ش��ϴ� ������ �����ڷ� �Ѱ��ش�.
	 * ���⼭�� java built-in Observable�� ����Ѵ�.
	 */
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current contditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}
	
	@Override
	public void update(Observable obs, Object org) {
		
		if(obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
}
