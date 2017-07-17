/**
 * 
 */
package pattern.creational.abstractfactory;

/**
 * @author Sanket Gupta
 *
 */
public class FactoryProducer {

	/**
	 * This method will return factory class.
	 * @param factory
	 * @return {@link AbstractFactory}
	 */
	public AbstractFactory getFactory(String factory) {
		if (factory.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		}else if (factory.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
}
