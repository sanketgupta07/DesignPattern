/**
 * 
 */
package pattern.creational.builder;

/**
 * @author Sanket Gupta
 *
 */
public class BuilderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		
		PizzaMeal normal = waiter.getMeal("Normal");
		System.out.println(normal);
		
		PizzaMeal cheasy = waiter.getMeal("Chease_Burst");
		System.out.println(cheasy);
		
		PizzaMeal plain = waiter.getMeal("plain");
		System.out.println(plain);
				
	}

}
