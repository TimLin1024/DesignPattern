package factory;

public class PizzaTestDrive {
	
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		Pizza pizz = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a "+ pizz.getName()+"\n");
	}
}
