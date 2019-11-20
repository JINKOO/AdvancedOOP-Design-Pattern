package factoryPattern_RE;

/*
 * Pizza Factroy Class�̴�.
 * ���⼭�� Factory pattern�� Factory Method�� ����Ѵ�.
 * Pizza������ reference ������ �ְ�
 * Factory Method���� Ư�� ���ǿ� �µ��� 
 * ������ ������ Ư�� ��ü�� �����Ѵ�.
 * 
 */
public class PizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if(type.equals("cheese"))
			pizza = new CheesePizza();
		else if(type.equals("quatro"))
			pizza = new QuatroFormadPizza();
		
		return pizza;
	}
}
