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
		System.out.println("�Ϲ� ���");
	}
}

class RamenWithBroth2 implements CookRecipe {
	
	@Override
	public void cook() {
		System.out.println("������ ���� ���");
	}
}

class RamenWithCheese2 implements CookRecipe {
	
	@Override
	public void cook() {
		System.out.println("ġ�� ���");
	}
}

class RamenWithMilk2 implements CookRecipe {
	
	@Override
	public void cook() {
		System.out.println("����� ������ ���");
	}
}

class RamenWithVinegar2 implements CookRecipe {
	
	@Override
	public void cook() {
		System.out.println("�� + ���� ���");
	}
}

public class RamenV3 {

	public static void main(String[] args) {
		
		/*
		 * ������ ���� �ϴ� ���
		 */
//		Ramen3 r3 = new Ramen3();
//		r3.setCookRecipe(new RamenWithCheese2());
//		r3.ramenCook();
	
		
		/*
		 * ����ڰ� �޴��� ����
		 * ��� �޴�����
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
