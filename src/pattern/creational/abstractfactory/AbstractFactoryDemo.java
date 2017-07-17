/**
 * 
 */
package pattern.creational.abstractfactory;

import pattern.creational.factory.Shape;

/**
 * @author Sanket Gupta
 *
 */
public class AbstractFactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FactoryProducer factory = new FactoryProducer();
		AbstractFactory shape = factory.getFactory("SHAPE");
		Shape circle = shape.getShape("CIRCLE");
		circle.draw();
		
		Shape rectangle = shape.getShape("rectangle");
		rectangle.draw();
		
		AbstractFactory color = factory.getFactory("COLOR");
		Color red = color.getColor("RED");
		red.fill();
		
		Color green = color.getColor("GREEN");
		green.fill();
	}

}
