/**
 * Director for the pattern
 */
package pattern.creational.builder;

/**
 * @author Sanket Gupta
 *
 */
public class Waiter {
	
	private MealBuilder builder;

	/**
	 * This method will create requested {@link PizzaMeal}.
	 * @param type
	 * @return {@link PizzaMeal}
	 */
	public PizzaMeal getMeal(String type) {
		if (type.equalsIgnoreCase("NORMAL")) {
			builder = new NormalPizza();
		}else if (type.equalsIgnoreCase("CHEASE_BURST")) {
			builder = new CheaseBurstPizza();
		}else {
			//Can create custom PizzaMeal as well.
			builder = new MealBuilder() {
				
				@Override
				public String buildDrink() {
					return "Water";
				}
				
				@Override
				public String buildChease() {
					return "No Chease";
				}
			};
		}
		return builder.getMeal();
	}
}
