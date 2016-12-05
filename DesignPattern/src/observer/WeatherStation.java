package observer;

public class WeatherStation {
	
	public static void main(String[] args) {
		WeatherSubject weatherSubject = new WeatherSubject();
		
		CurrentConditionDisplay cDisplay = new CurrentConditionDisplay(weatherSubject);
		
		weatherSubject.setMeasurements(80, 65, 30.4f);
	}
	
}
