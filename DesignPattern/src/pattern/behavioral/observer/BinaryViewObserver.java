/**
 * 
 */
package pattern.behavioral.observer;

/**
 * @author Sanket Gupta
 *
 */
public class BinaryViewObserver extends Observer {
	
	

	/**
	 * Constructor will register {@link BinaryViewObserver} to {@link Subject}'s {@link Observer} list
	 */
	public BinaryViewObserver(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}

	/* (non-Javadoc)
	 * @see com.observer.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("Subject's State in Binary:"+Integer.toBinaryString(this.subject.getState()));

	}

}
