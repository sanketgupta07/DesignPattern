/**
 * Concrete Implementation of Builder class
 */
package pattern.creational.builder;

/**
 * @author Sanket Gupta
 *
 */
public class CheaseBurstPizza extends MealBuilder {

	/* (non-Javadoc)
	 * @see pattern.creational.Builder.MealBuilder#buildChease()
	 */
	@Override
	public String buildChease() {
		// TODO Auto-generated method stub
		return "Extra";
	}

	/* (non-Javadoc)
	 * @see pattern.creational.Builder.MealBuilder#buildDrink()
	 */
	@Override
	public String buildDrink() {
		// TODO Auto-generated method stub
		return "Pepsi";
	}

}
