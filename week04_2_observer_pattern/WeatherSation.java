package week04_2_observer_pattern;

/*
 * 
 * built-in Observable Class»ç¿ë
 */

public class WeatherSation {

	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay current = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(32.4f, 54.0f, 10f);
	}
}
