package decorator;

public class Mocha extends CondimentDecorator{ //Ħ��Ϊһ��װ�����࣬��չ��CondimentDecorator���໹��beverage
	Beverage beverage; //Ҫ��Mocha�ܹ�����һ��Berverage����Ҫ1.��һ��ʵ����������¼��װ���ߣ�������������
	// 2.�뷽���ѱ�װ���߼�¼��ʵ�������С� �˴���������Ϊ����������
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
