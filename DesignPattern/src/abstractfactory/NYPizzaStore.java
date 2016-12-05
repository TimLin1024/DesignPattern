package abstractfactory;

import javax.jws.soap.SOAPBinding.Style;

public class NYPizzaStore extends PizzaStore{
	
	public Pizza createPizza(String item) {
		
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if (item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		}else if (item.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		}
		
		return pizza;
	}

}
