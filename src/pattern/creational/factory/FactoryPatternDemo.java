/**
 * 
 */
package pattern.creational.factory;

/**
 * @author Sanket Gupta
 *
 */
public class FactoryPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		
		Shape circle =  factory.getShape("circle");
		circle.draw();
		
		Shape rectangle =  factory.getShape("rectangle");
		rectangle.draw();

	}

}
