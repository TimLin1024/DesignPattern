package observer;
import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject {
	
	List<Observer> observers = new ArrayList<>();
	private float temp;
	private float humidity;
	private float pressure;
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int len = observers.size();
		if (len>1) {
			observers.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temp, humidity, pressure);
		}
	}
	
	public void mesurementChange() {
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		mesurementChange();
	}
}

