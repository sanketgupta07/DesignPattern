/**
 * 
 */
package pattern.creational.abstractfactory;

import pattern.creational.factory.Shape;

/**
 * @author Sanket Gupta
 *
 */
public abstract class AbstractFactory {
	
	/**
	 * This method will return {@link Shape} object.
	 * @param type
	 * @return {@link Shape}
	 */
	public abstract Shape getShape(String type);
	
	/**
	 * This method will return factory class for {@link Color}
	 * @param type
	 * @return {@link Color}
	 */
	public abstract Color getColor(String type);
}
