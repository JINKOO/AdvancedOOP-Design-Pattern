package week04_2_observer_pattern;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private Observable observable;
	private float temperature;
	private float humidity;
	
	/*
	 * Subject에 해당하는 변수를 생성자로 넘겨준다.
	 * 여기서는 java built-in Observable를 사용한다.
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
