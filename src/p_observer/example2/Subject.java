package p_observer.example2;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> observers = new ArrayList<>();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	/**
	 * 通知
	 */
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
}
