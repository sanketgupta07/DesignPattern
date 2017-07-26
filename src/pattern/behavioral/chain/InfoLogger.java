/**
 * 
 */
package pattern.behavioral.chain;

/**
 * @author Sanket Gupta
 *
 */
public class InfoLogger extends Logger {

	/**
	 * 
	 */
	public InfoLogger() {
		this.level = Logger.INFO;
	}

	/* (non-Javadoc)
	 * @see pattern.structural.chain.Logger#printMsg(java.lang.String)
	 */
	@Override
	protected void printMsg(String msg) {
		System.out.println("INFO: "+msg);

	}

}
