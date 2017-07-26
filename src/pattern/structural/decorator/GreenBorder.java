/**
 * 
 */
package pattern.structural.decorator;

import pattern.creational.factory.Shape;

/**
 * @author Sanket Gupta
 *
 */
public class GreenBorder extends ShapeDecorator {

	/**
	 * @param shape
	 */
	public GreenBorder(Shape shape) {
		super(shape);
	}

	/**
	 *  Extra behavior to add in shape.
	 */
	private void setGreenBorder(){
		System.out.println("Adding GREEN border color.");
	}
	
	/*
	 * (non-Javadoc)
	 * @see pattern.structural.decorator.ShapeDecorator#draw()
	 */
	@Override
	public void draw() {
		super.draw();
		this.setGreenBorder();		
	}
}
