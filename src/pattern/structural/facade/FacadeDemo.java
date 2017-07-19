/**
 * 
 */
package pattern.structural.facade;

/**
 * @author Sanket Gupta
 *
 */
public class FacadeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer computer = new Computer();
		//without facade
//		computer.powerSwitch(true);
//		computer.loadMemory();
//		computer.booting();
		// With facade method
		computer.startComputer();
	}

}
