/**
 * 
 */
package pattern.structural.chain;

/**
 * @author Sanket Gupta
 *
 */
public class ChainLoggers {

	/**
	 * Initialize loggers
	 * @return {@link Logger}
	 */
	public static Logger getLogger(){
		Logger errorLogger  = new ErrorLogger();
		Logger fileLogger = new DebugLogger();
		Logger consoleLogger = new InfoLogger();
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		return errorLogger;
	}

}
