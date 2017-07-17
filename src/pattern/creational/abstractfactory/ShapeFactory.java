/**
 * 
 */
package pattern.creational.abstractfactory;

import pattern.creational.factory.Circle;
import pattern.creational.factory.Rectangle;
import pattern.creational.factory.Shape;

/**
 * @author Sanket Gupta
 *
 */
public class ShapeFactory extends AbstractFactory {

	/*
	 * (non-Javadoc)
	 * @see pattern.creational.abstractfactory.AbstractFactory#getShape(java.lang.String)
	 */
	public Shape getShape(String type){
		if (type.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}else if (type.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		return null;
	}

	@Override
	public Color getColor(String type) {
		// TODO Auto-generated method stub
		return null;
	}
}
