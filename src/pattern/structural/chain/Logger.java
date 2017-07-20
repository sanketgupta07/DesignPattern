/**
 * 
 */
package pattern.structural.chain;

/**
 * @author Sanket Gupta
 *
 */
public abstract class Logger {

	protected int level;
	public final static int INFO=1;
	public final static int DEBUG=2;
	public final static int ERROR=3;
	
	private Logger nextLogger;
	
	public void setNextLogger(Logger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
	public void log(int level,String msg){
		if(this.level <= level)
			this.printMsg(msg);
		else if (nextLogger!=null) 
			nextLogger.log(level, msg);
	}
	
	protected abstract void printMsg(String msg);
	
}
