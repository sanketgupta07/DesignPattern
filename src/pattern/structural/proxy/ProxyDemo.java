/**
 * 
 */
package pattern.structural.proxy;

/**
 * @author Sanket Gupta
 *
 */
public class ProxyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Image image = new ProxyImage("sky.jpeg");
		image.display();
//		Calling again the same method to load image.
		image.display();

	}

}
