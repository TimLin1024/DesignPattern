package factory;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) { //createPizza()方法从工厂对象中移回{PizzaStore
		Pizza pizza;
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	public abstract Pizza createPizza(String type);
}
