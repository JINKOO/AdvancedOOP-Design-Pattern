package week03_2_strategy_pattern;

/*
 * 라면 조리법 Version1
 * 모든 것을 Ramen Class에 때려박는다.
 * 우리가 주어진 문제를 가지고 바로 코딩할 때 가장 일반적인 형태
 * 상속사용하지 않음
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
		System.out.println("일반 조리법으로 끓이기");
	}
	
	public void cookWithoutBroth() {
		System.out.println("물을 적게 넣고 라면을 익힌 뒤에 볶듯이 끓임");
	}
	
	public void cookWithCheese() {
		System.out.println("치즈 라면");
	}
	
	public void cookWithVinegar() {
		System.out.println("식초 라면");
	}
	
	public void cookWithMilk() {
		System.out.println("물대신 우유를 넣고 제조");
	}
}

public class RamenV1 {

	public static void main(String[] args) {
		
		Ramen1 cook = new Ramen1();
		cook.setCookingMode(Ramen1.CookingMode.WITH_CHEESE);
		cook.cook();
	}
}
