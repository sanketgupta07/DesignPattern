/**
 * 
 */
package pattern.structural.proxy;

/**
 * @author Sanket Gupta
 *
 */
public class ProxyImage implements Image {

	private String image;
	private RealImage real;
	public ProxyImage(String image) {
		this.image = image;
	}

	/* (non-Javadoc)
	 * @see pattern.structural.proxy.Image#display(java.lang.String)
	 */
	@Override
	public void display() {		
		if(real==null){
			System.out.println("Displaying proxy image for: "+image);
			real = new RealImage(image);
		}
		real.display();

	}

}
