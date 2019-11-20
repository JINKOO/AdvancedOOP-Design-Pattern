package factoryPattern_RE;

/*
 * PizzaStore Class이다.
 * 여기서는 Factory Class에 대한 reference 변수를 가진다.
 * 
 * Factory를 사용하는 Client부분이다. 
 * Factory를 사용하여 피자 instance를 받게 된다. 
 * 
 * 여기서는 특정 구상Class를 사용한다.
 * 즉 PizzaFactory라는 특정 구상 Class에 의존한다.
 * 
 * 만약 프랜차이즈 사업을 하려면
 * 변경이 필요하다. 새 분점들이 각각 Pizza Store를 구현하도록 한다. 
 */
public class PizzaStore {

	private PizzaFactory factory;
	
	public PizzaStore(PizzaFactory factory) {
		this.factory = factory;
	}
	
	public void prepareToBoxing(Pizza pizza) {
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.boxing();
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = factory.createPizza(type);
		prepareToBoxing(pizza);
		return pizza;
	}
}
