/**
 * 
 */
package pattern.creational.abstractfactory;

import pattern.creational.factory.Shape;

/**
 * @author Sanket Gupta
 *
 */
public class ColorFactory extends AbstractFactory{
	
	/*
	 * (non-Javadoc)
	 * @see pattern.creational.abstractfactory.AbstractFactory#getColor(java.lang.String)
	 */
	public Color getColor(String type){
		
		if (type.equalsIgnoreCase("RED")) {
			return new Red();
		}else if (type.equalsIgnoreCase("GREEN")) {
			return new Green();
		}
		return null;
	}

	@Override
	public Shape getShape(String type) {
		// TODO Auto-generated method stub
		return null;
	}

}
