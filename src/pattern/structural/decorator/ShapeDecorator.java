/**
 * 
 */
package pattern.structural.decorator;

import pattern.creational.factory.Shape;

/**
 * @author Sanket Gupta
 *
 */
public abstract class ShapeDecorator implements Shape {
	
	private Shape shape;

	/* (non-Javadoc)
	 * @see pattern.creational.factory.Shape#draw()
	 */
	@Override
	public void draw() {
		this.shape.draw();

	}

	/**
	 * @param shape
	 */
	public ShapeDecorator(Shape shape) {
		this.shape = shape;
	}

}
