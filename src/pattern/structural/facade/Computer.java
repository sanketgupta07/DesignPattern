/**
 * 
 */
package pattern.structural.facade;

/**
 * @author Sanket Gupta
 *
 */
public class Computer {

	/**
	 * Power switch for computer.
	 * @param flag
	 */
	public void powerSwitch(boolean flag){
		if(flag)
			System.out.println("Switch:ON");
		else 
			System.out.println("Switch:OFF");
	}
	
	/**
	 * Memory loading.
	 */
	public void loadMemory(){
		System.out.println("Loding memory...");
	}
	
	/**
	 * Booting of computer.
	 */
	public void booting(){
		System.out.println("Booting computer.");
		System.out.println("Computer is ready to use.");
	}
	
	/**
	 * Facade method to do all processing at one place.
	 */
	public void startComputer(){
		powerSwitch(true);
		loadMemory();
		booting();		
	}
}
