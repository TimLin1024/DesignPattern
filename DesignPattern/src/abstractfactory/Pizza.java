package abstractfactory;
import java.util.ArrayList;
//���б������̳��Ը���
public abstract class Pizza {
	String name;//��
	Dough dough;//��������
	Sauce sauce;//����
	Cheese cheese;
	Veggies[] veggies;
	Pepperoni pepperoni;
	Clams clam;
	
	
	abstract void prepare();
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
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}
	
}
