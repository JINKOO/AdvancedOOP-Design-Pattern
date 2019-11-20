package factoryPattern_RE;

/*
 * Pizza Factroy Class이다.
 * 여기서의 Factory pattern은 Factory Method를 사용한다.
 * Pizza에대한 reference 변수가 있고
 * Factory Method에서 특정 조건에 맞도록 
 * 종류별 피자의 특정 객체를 생성한다.
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
