/**
 * 
 */
package com.observer;

/**
 * @author Sanket Gupta
 *
 */
public class ObserverDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		Initialize Subject and register all observer
		Subject subject = new Subject();
		new BinaryViewObserver(subject);
		new OctaViewObserver(subject);
		new HexaViewObserver(subject);
//		Chnage the Subject state variable
		System.out.println("Setting Subject's state: "+10+"\n");
		subject.setState(10);
		
		System.out.println("Setting Subject's state: "+20+"\n");
		subject.setState(20);
		

	}

}
