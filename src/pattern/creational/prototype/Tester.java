/**
 * 
 */
package pattern.creational.prototype;

/**
 * @author Sanket Gupta
 *
 */
public class Tester extends Employee {

	/**
	 * 
	 */
	public Tester() {
		this.setDesignation("TESTER");
	}

	@Override
	public void identify() {
		System.out.println("I am a tester. My name is "+this.getName());
		
	}

}
