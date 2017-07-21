/**
 * 
 */
package pattern.structural.proxy;

/**
 * @author Sanket Gupta
 *
 */
public class RealImage implements Image {

	private String image;

	public RealImage(String image) {
		this.image = image;
		this.loadImage(image);
	}

	/* (non-Javadoc)
	 * @see pattern.structural.proxy.Image#display()
	 */
	@Override
	public void display() {
		System.out.println("Displaying real image: "+image);

	}

	private void loadImage(String image){
		System.out.println("Loading Image");
	}

}
