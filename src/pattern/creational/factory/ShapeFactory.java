/**
 * 
 */
package pattern.creational.factory;

/**
 * @author Sanket Gupta
 *
 */
public class ShapeFactory {
	
/**
 * This method will return shape object.
 * @param type
 * @return {@link Shape}
 */
	public Shape getShape(String type){
		if (type.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}else if (type.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		return null;
	}
}
