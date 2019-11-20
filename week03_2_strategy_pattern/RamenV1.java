package week03_2_strategy_pattern;

/*
 * ��� ������ Version1
 * ��� ���� Ramen Class�� �����ڴ´�.
 * �츮�� �־��� ������ ������ �ٷ� �ڵ��� �� ���� �Ϲ����� ����
 * ��ӻ������ ����
 */

class Ramen1 {
	
	public static enum CookingMode {
		GENERAL,
		WITHOUT_BROTH,
		WITH_CHEESE,
		WITH_VINEGAR,
		WITH_MILK
	}
	
	private CookingMode mode;
	
	Ramen1() {
		mode = CookingMode.GENERAL;
	}
	
	public void setCookingMode(CookingMode mode) {
		this.mode = mode;
	}
	
	public void cook() {
		switch(mode) {
		case GENERAL:
			cookWithGeneralRecipe();
			break;
		case WITHOUT_BROTH:
			cookWithoutBroth();
			break;
		case WITH_CHEESE:
			cookWithCheese();
			break;
		case WITH_VINEGAR:
			cookWithVinegar();
			break;
		case WITH_MILK:
			cookWithMilk();
			break;
		}
	}
	
	public void cookWithGeneralRecipe() {
		System.out.println("�Ϲ� ���������� ���̱�");
	}
	
	public void cookWithoutBroth() {
		System.out.println("���� ���� �ְ� ����� ���� �ڿ� ������ ����");
	}
	
	public void cookWithCheese() {
		System.out.println("ġ�� ���");
	}
	
	public void cookWithVinegar() {
		System.out.println("���� ���");
	}
	
	public void cookWithMilk() {
		System.out.println("����� ������ �ְ� ����");
	}
}

public class RamenV1 {

	public static void main(String[] args) {
		
		Ramen1 cook = new Ramen1();
		cook.setCookingMode(Ramen1.CookingMode.WITH_CHEESE);
		cook.cook();
	}
}
