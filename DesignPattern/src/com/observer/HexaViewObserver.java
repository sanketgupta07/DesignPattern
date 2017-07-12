/**
 * 
 */
package com.observer;

/**
 * @author Sanket Gupta
 *
 */
public class HexaViewObserver extends Observer {
	
	

	/**
	 * Constructor will register {@link HexaViewObserver} to {@link Subject}'s {@link Observer} list
	 */
	public HexaViewObserver(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}

	/* (non-Javadoc)
	 * @see com.observer.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("Subject's State in HexaDecimal:"+Integer.toHexString(this.subject.getState()));

	}

}
