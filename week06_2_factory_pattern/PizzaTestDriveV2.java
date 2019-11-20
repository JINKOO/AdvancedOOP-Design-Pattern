package week06_2_factory_pattern;

/*
 * ���� ���������� ���
 * ���� PizzaStore���� �ϰ������� ��� ���ڸ� �����Ѵ�.
 * ������ 
 * ���� ���� ���� �ٸ� Ư¡�� ���ڵ��� �ִ�. 
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
