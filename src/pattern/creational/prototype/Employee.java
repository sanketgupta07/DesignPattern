/**
 * 
 */
package pattern.creational.prototype;

/**
 * @author Sanket Gupta
 *
 */
public abstract class Employee implements Cloneable {

	private String designation;
	private String name;


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}


	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * This method will print some identity of {@link Employee}
	 */
	public abstract void identify();
	
	/**
	 * Overriding clone to return {@link Employee}
	 */
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		Employee employee = (Employee) super.clone();
		return employee;
	}
}
