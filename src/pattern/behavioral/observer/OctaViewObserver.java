/**
 * 
 */
package pattern.behavioral.observer;

/**
 * @author Sanket Gupta
 *
 */
public class OctaViewObserver extends Observer {
	
	

	/**
	 * Constructor will register {@link OctaViewObserver} to {@link Subject}'s {@link Observer} list
	 */
	public OctaViewObserver(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}

	/* (non-Javadoc)
	 * @see com.observer.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("Subject's State in OctaDecimal:"+Integer.toOctalString(this.subject.getState()));

	}

}
