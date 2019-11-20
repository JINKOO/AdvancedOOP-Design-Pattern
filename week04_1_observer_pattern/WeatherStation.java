package week04_1_observer_pattern;

public class WeatherStation {
	
	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay current = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statictic = new StatisticsDisplay(weatherData);
		ForecastDisplay forecast = new ForecastDisplay(weatherData);
		
		//변경 되었을 때만 부른다. 
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
