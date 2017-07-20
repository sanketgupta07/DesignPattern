/**
 * 
 */
package pattern.structural.chain;

/**
 * @author Sanket Gupta
 *
 */
public class ChainDemo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Logger logger = ChainLoggers.getLogger();
		
		logger.log(Logger.INFO, "Starting logging.");
		logger.log(Logger.DEBUG, "Debugging here.");
		logger.log(Logger.ERROR, "Error occured");
		
	}

}
