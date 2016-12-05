package decorator;

public class Mocha extends CondimentDecorator{ //摩卡为一个装饰者类，拓展自CondimentDecorator基类还是beverage
	Beverage beverage; //要让Mocha能够引用一个Berverage，需要1.用一个实例变量来记录被装饰者，（这里是饮料
	// 2.想方法把被装饰者记录到实例变量中。 此处把饮料作为构造器参数
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}	
	@Override
	public String getDescription() {

		return beverage.getDescription()+", Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .20 + beverage.cost();
	}

}
