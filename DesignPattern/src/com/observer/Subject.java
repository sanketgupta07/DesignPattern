/**
 * 
 */
package com.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sanket Gupta
 *
 */
public class Subject {

	//List of observer---> will be used to update whenever state chnaged
	private List<Observer> observers = new ArrayList<Observer>();
	//Variable which will be observed for change
	private int state;
	
	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
		notifyAllObserver();
	}

	public void addObserver(Observer observer){
		observers.add(observer);
	}
	
	public void notifyAllObserver() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
