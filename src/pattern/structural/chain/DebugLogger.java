/**
 * 
 */
package pattern.structural.chain;

/**
 * @author Sanket Gupta
 *
 */
public class DebugLogger extends Logger {

	/**
	 * 
	 */
	public DebugLogger() {
		this.level = Logger.DEBUG;
	}

	/* (non-Javadoc)
	 * @see pattern.structural.chain.Logger#printMsg(java.lang.String)
	 */
	@Override
	protected void printMsg(String msg) {
		System.out.println("Debug: "+msg);

	}

}
