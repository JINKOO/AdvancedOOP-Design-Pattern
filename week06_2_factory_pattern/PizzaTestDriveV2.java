package week06_2_factory_pattern;

/*
 * 피자 프랜차이즈 사업
 * 기존 PizzaStore에서 일괄적으로 모든 피자를 관리한다.
 * 하지만 
 * 지역 별로 서로 다른 특징의 피자들이 있다. 
 */
public class PizzaTestDriveV2 {

	public static void main(String[] args) {
		
		PizzaStoreV2 nyPizza = new NYPizzaStore();
		PizzaStoreV2 stPizza = new STPizzaStore();
		
		PizzaV2 pizza = nyPizza.orderPizza("cheese");
		System.out.println("Mr.Ko ordered a " + pizza.getName());
		
		pizza = stPizza.orderPizza("cheese");
		System.out.println("She ordered a " + pizza.getName());
	}
}
