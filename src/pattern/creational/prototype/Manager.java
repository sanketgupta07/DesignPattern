/**
 * 
 */
package pattern.creational.prototype;

/**
 * @author Sanket Gupta
 *
 */
public class Manager extends Employee {

	/**
	 * 
	 */
	public Manager() {
		this.setDesignation("MANAGER");
	}

	@Override
	public void identify() {
		System.out.println("I am a manager. My name is "+this.getName());
		
	}

}
