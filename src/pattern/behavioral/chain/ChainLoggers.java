/**
 * This class will help to set the chain of loggers
 */
package pattern.behavioral.chain;

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
		Logger debugLogger = new DebugLogger();
		Logger infoLogger = new InfoLogger();
		errorLogger.setNextLogger(debugLogger);
		debugLogger.setNextLogger(infoLogger);
		return errorLogger;
	}

}
