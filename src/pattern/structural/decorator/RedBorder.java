/**
 * 
 */
package pattern.structural.decorator;

import pattern.creational.factory.Shape;

/**
 * @author Sanket Gupta
 *
 */
public class RedBorder extends ShapeDecorator {

	/**
	 * @param shape
	 */
	public RedBorder(Shape shape) {
		super(shape);		
	}
	
	/**
	 * Extra behavior to add in shape.
	 */
	private void setRedBorder(){
		System.out.println("Adding RED border color");
	}
	
	/*
	 * (non-Javadoc)
	 * @see pattern.structural.decorator.ShapeDecorator#draw()
	 */
	@Override
	public void draw() {
		super.draw();
		this.setRedBorder();		
	}

}
