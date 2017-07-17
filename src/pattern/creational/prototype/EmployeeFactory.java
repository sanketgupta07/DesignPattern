/**
 * 
 */
package pattern.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sanket Gupta
 *
 */
public class EmployeeFactory {

	Map<String, Employee> empMap = new HashMap<String, Employee>();

	/**
	 * Load employee list from expensive process like DB call or file reading I/O etc.
	 */
	public void loading(){
		this.empMap.put("MANAGER", new Manager());
		this.empMap.put("DEVELOPER", new Developer());
		this.empMap.put("TESTER", new Tester());
	}

	/**
	 * This method will return a clone of {@link Employee} based on designation.
	 * @param designation
	 * @return {@link Employee}
	 * @throws CloneNotSupportedException
	 */
	public Employee getEmployee(String designation) throws CloneNotSupportedException{
		Employee employee = this.empMap.get(designation).clone();
		return employee;
	}

}
