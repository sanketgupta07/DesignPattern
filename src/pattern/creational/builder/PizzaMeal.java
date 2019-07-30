/**
 * Object which will use the Builder pattern
 */
package pattern.creational.builder;

/**
 * @author Sanket Gupta
 *
 */
public class PizzaMeal {
	
	private String chease;
	private String drink;
	/**
	 * @return the chease
	 */
	public String getChease() {
		return chease;
	}
	/**
	 * @param chease the chease to set
	 */
	public void setChease(String chease) {
		this.chease = chease;
	}
	/**
	 * @return the drink
	 */
	public String getDrink() {
		return drink;
	}
	/**
	 * @param drink the drink to set
	 */
	public void setDrink(String drink) {
		this.drink = drink;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PizzaMeal [chease=" + chease + ", drink=" + drink + "]";
	}	
}
