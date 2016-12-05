package factory;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) { //createPizza()�����ӹ����������ƻ�{PizzaStore
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
