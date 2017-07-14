/**
 * 
 */
package pattern.creational.singleton;

/**
 * @author Sanket Gupta
 *
 */
public class SingletonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonClass obj1 = SingletonClass.getInstance();
		System.out.println("Instance count:"+SingletonClass.insCount);
		
		SingletonClass obj2 = SingletonClass.getInstance();
		System.out.println("Instance count:"+SingletonClass.insCount);

	}

}
