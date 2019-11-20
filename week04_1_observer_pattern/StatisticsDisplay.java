package week04_1_observer_pattern;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float maxTemp;
	private float minTemp;
	private float tempSum;
	private int numReadings;
	private WeatherData weatherData;
	
	
	public StatisticsDisplay(WeatherData weatherData) {
		// TODO Auto-generated constructor stub
		this.maxTemp = 0.0f;
		this.minTemp = 200.0f;
		this.tempSum = 0.0f;
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		tempSum = tempSum + temperature;
		numReadings++;
		
		if(temperature > maxTemp)
			maxTemp = temperature;
		
		if(temperature < minTemp)
			minTemp = temperature;
		
		display();
	}
	
	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
				+ "/" + maxTemp + "/" + minTemp);
	}

}
