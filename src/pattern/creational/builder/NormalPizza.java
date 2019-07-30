/**
 * Concrete Implementation of Builder class
 */
package pattern.creational.builder;

/**
 * @author Sanket Gupta
 *
 */
public class NormalPizza extends MealBuilder {

	/* (non-Javadoc)
	 * @see pattern.creational.Builder.MealBuilder#buildChease()
	 */
	@Override
	public String buildChease() {
		return "Normal";
	}

	/* (non-Javadoc)
	 * @see pattern.creational.Builder.MealBuilder#buildDrink()
	 */
	@Override
	public String buildDrink() {
		return "Coke";
	}
}
