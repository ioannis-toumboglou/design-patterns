package III.DecoratorPattern;

public class StarBuzzCoffee {

	public static void main(String[] args) {
		// Espresso
		Beverage beverage = new Espresso();
		
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		// Double Mocha + Whip
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
	}

}
