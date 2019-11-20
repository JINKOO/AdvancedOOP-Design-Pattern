package week03_2_strategy_pattern;



interface CookRecipe {	
	public void cook();
}


class Ramen3 {
	
	private CookRecipe cookRecipe;
	
	void setCookRecipe(CookRecipe cookRecipe) {
		this.cookRecipe = cookRecipe;
	}
	
	CookRecipe getCookRecipe() {
		return this.cookRecipe;
	}
	
	void ramenCook() {
		cookRecipe.cook();
	}
	
}

class GeneralRamen2 implements CookRecipe{
	
	@Override
	public void cook() {
		System.out.println("일반 라면");
	}
}

class RamenWithBroth2 implements CookRecipe {
	
	@Override
	public void cook() {
		System.out.println("물없이 볶은 라면");
	}
}

class RamenWithCheese2 implements CookRecipe {
	
	@Override
	public void cook() {
		System.out.println("치즈 라면");
	}
}

class RamenWithMilk2 implements CookRecipe {
	
	@Override
	public void cook() {
		System.out.println("물대신 우유라떼 라면");
	}
}

class RamenWithVinegar2 implements CookRecipe {
	
	@Override
	public void cook() {
		System.out.println("물 + 식초 라면");
	}
}

public class RamenV3 {

	public static void main(String[] args) {
		
		/*
		 * 일일이 대입 하는 방법
		 */
//		Ramen3 r3 = new Ramen3();
//		r3.setCookRecipe(new RamenWithCheese2());
//		r3.ramenCook();
	
		
		/*
		 * 사용자가 메뉴판 보고
		 * 라면 메뉴고르기
		 */
		RamenV3Menu menu = new RamenV3Menu();
		do {
			menu.showRamenMenu();
			menu.setFoodCount();
			menu.showSelectedRamen();
			menu.getOrderdList().clear();
		} while(menu.getIsContinue());
	}
}
