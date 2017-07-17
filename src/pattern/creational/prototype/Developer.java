/**
 * 
 */
package pattern.creational.prototype;

/**
 * @author Sanket Gupta
 *
 */
public class Developer extends Employee {

	/**
	 * 
	 */
	public Developer() {
		this.setDesignation("DEVELOPER");
	}

	@Override
	public void identify() {
		System.out.println("I am a developer. My name is "+this.getName());
		
	}

}
