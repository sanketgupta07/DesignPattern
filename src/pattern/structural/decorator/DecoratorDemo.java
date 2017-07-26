/**
 * We will use Factory pattern classes {@link Shape}, {@link Circle} and {@link Rectangle}.
 */
package pattern.structural.decorator;
import pattern.creational.factory.*;




/**
 * 
 * Demo for factory and decorator pattern
 * @author Sanket Gupta
 *
 */
public class DecoratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape circle = new RedBorder(factory.getShape("CIRCLE"));
		Shape rectangle = new RedBorder(factory.getShape("RECTANGLE"));
		
		circle.draw();
		rectangle.draw();

	}

}
