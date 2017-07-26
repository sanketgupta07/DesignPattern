/**
 * 
 */
package pattern.behavioral.chain;

/**
 * @author Sanket Gupta
 *
 */
public abstract class Logger {

	/**
	 * Constants logs levels
	 */
	public final static int INFO=1;
	public final static int DEBUG=2;
	public final static int ERROR=3;
	
	protected int level;
	private Logger nextLogger;

	/**
	 * To set next {@link Logger} in the chain.
	 * @param nextLogger
	 */
	public void setNextLogger(Logger nextLogger) {
		this.nextLogger = nextLogger;
	}

	/**
	 * Validation for log level to print msg or pass request to next {@link Logger}
	 * @param level
	 * @param msg
	 */
	public void log(int level,String msg){
		if(this.level <= level)
			this.printMsg(msg);
		else if (nextLogger!=null) 
			nextLogger.log(level, msg);
	}

	/**
	 * This method will print msg.
	 * @param msg
	 */
	protected abstract void printMsg(String msg);

}
