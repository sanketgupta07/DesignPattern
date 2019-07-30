/**
 * Builder class
 */
package pattern.creational.builder;

/**
 * @author Sanket Gupta
 *
 */
public abstract class MealBuilder {

	private PizzaMeal meal = new PizzaMeal();
	
	/**
	 * to build chease for {@link PizzaMeal}
	 * @return {@link String}
	 */
	public abstract String buildChease();
	
	/**
	 * This will build some drink with {@link PizzaMeal}
	 * @return
	 */
	public abstract String buildDrink();
	
	/**
	 * this will return a {@link PizzaMeal} on request
	 * @return {@link PizzaMeal}
	 */
	protected  PizzaMeal getMeal() {
		meal.setChease(buildChease());
		meal.setDrink(buildDrink());
		return meal;
	}
}
