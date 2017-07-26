/**
 * 
 */
package pattern.behavioral.chain;

/**
 * @author Sanket Gupta
 *
 */
public class ErrorLogger extends Logger {

	/**
	 * 
	 */
	public ErrorLogger() {
		this.level = Logger.ERROR;
	}

	/* (non-Javadoc)
	 * @see pattern.structural.chain.Logger#printMsg(java.lang.String)
	 */
	@Override
	protected void printMsg(String msg) {
		System.err.println("Error: "+msg);

	}

}
