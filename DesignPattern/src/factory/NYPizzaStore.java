package factory;

public class NYPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza;
		if (type.equals("cheese")) {
			return new NYStyleCheesePizza();
		}else {
			return null;
		}
	}

}
