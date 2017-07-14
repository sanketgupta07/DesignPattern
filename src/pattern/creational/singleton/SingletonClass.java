/**
 * Steps to create Singleton class.
 * 1. Create a private static reference of the Class
 * 2. Make Constructor to private
 * 3. Create a public static method to instantiate class with null check of private reference of the class.
 */
package pattern.creational.singleton;

/**
 * @author Sanket Gupta
 *
 */
public class SingletonClass {

	private static SingletonClass instance;
	public static int insCount = 0;
	/*
	 * private constructor to restrict to create instance from Constructor.
	 */
	private SingletonClass (){insCount++;}

	/**
	 * 
	 * @return {@link SingletonClass}
	 */
	public static SingletonClass getInstance(){
		if(instance==null){
			instance = new SingletonClass();
		}
		return instance;
	}
}
