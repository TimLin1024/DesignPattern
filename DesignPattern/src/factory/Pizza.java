package factory;
import java.util.ArrayList;
//所有比萨都继承自该类
public abstract class Pizza {
	String name;//名
	String dough;//面团类型
	String sauce;//酱料
	ArrayList toppings = new ArrayList();//一套佐料
	
	public void prepare(){
		System.out.println("Preparing" + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce");
		System.out.println("Adding toppings: ");
		for(int i = 0; i < toppings.size(); i++ ){
			System.out.println(" " + toppings.get(i));
		}
	}
	public void bake(){
		System.out.println("Bake for 25 minutes at 350");
	}
	public void cut(){
		System.out.println("Cutting the pizza into diagnoal slices");
	}
	public void box(){
		System.out.println("Place pizza in official PizzaStore box");
	}
	public String  getName() {
		return name;
	}
}
