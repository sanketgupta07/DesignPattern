/**
 * 
 */
package pattern.behavioral.observer;

/**
 * @author Sanket Gupta
 *
 */
public abstract class Observer {

	/**
	 *  Subject class to observe the state
	 */
	protected Subject subject;
	/**
	 * update me whenever Subject changes its state
	 */
	public abstract void update();

}
