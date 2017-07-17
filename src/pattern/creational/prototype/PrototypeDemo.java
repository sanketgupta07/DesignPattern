/**
 * 
 */
package pattern.creational.prototype;

/**
 * @author Sanket Gupta
 *
 */
public class PrototypeDemo {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		EmployeeFactory hr = new EmployeeFactory();
		//to create a cache of employees
		hr.loading();
		
		Employee manager1 = hr.getEmployee("MANAGER");
		Employee manager2 = hr.getEmployee("MANAGER");
		manager1.setName("Sanket");
		manager1.identify();		
		manager2.setName("Ankit");// this should not update the clone object as they refer the different memory space.
		manager2.identify();
		manager1.identify();
		
		Employee devloper = hr.getEmployee("DEVELOPER");
		devloper.setName("Rahul");
		devloper.identify();
		
		Employee tester = hr.getEmployee("TESTER");
		tester.setName("Rohit");
		tester.identify();
		
	}

}
