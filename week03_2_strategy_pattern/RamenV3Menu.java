package week03_2_strategy_pattern;

import java.util.ArrayList;
import java.util.Scanner;

public class RamenV3Menu {

	public static enum RamenMenu{
		GENERAL_RAMEN,
		RAMEN_WITH_CHEESE,
		RAMEN_WITH_VINEGAR,
		RAMEN_WITH_BROTH,
		RAMEN_WITH_MILK	
	}

	private Scanner sc;
	private ArrayList<Ramen3> list;
	
	
	public RamenV3Menu() {
		this.sc = new Scanner(System.in);
		this.list = new ArrayList<>();
	}
	
	
	public String inputStr() {
		String str = sc.nextLine();
		return str;
	}
	
	
	public int inputNum() {
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}
	
	
	public void showRamenMenu() {
		System.out.println("=========MENU========");
		System.out.println("1. " + 	RamenMenu.GENERAL_RAMEN);
		System.out.println("2. " + 	RamenMenu.RAMEN_WITH_CHEESE);
		System.out.println("3. " + 	RamenMenu.RAMEN_WITH_VINEGAR);
		System.out.println("4. " + 	RamenMenu.RAMEN_WITH_BROTH);
		System.out.println("5. " + 	RamenMenu.RAMEN_WITH_MILK);
		System.out.println("=====================");
	}
	
	
	//주문할 라면 갯수
	public int foodCount() {
		System.out.print("#. 주문량을 입력하세요  >>> ");
		int count = inputNum();
		return count;
	}
	
	
	public void selectMenu(int userNum) {
		System.out.print("#User" + userNum + ". 메뉴 번호 입력 >> ");
		int menuNum = inputNum();
		
		Ramen3 ramen = new Ramen3();
		
		switch(menuNum) {
		case 1:
			ramen.setCookRecipe(new GeneralRamen2());
			break;
		case 2:
			ramen.setCookRecipe(new RamenWithCheese2());
			break;
		case 3:
			ramen.setCookRecipe(new RamenWithVinegar2());
			break;
		case 4:
			ramen.setCookRecipe(new RamenWithBroth2());
			break;
		case 5:
			ramen.setCookRecipe(new RamenWithMilk2());
			break;
		default:
			System.out.println("[해당 번호에 해당하는 라면이 없습니다! 다시 입력 하세요~]");
		}
		
		if(ramen.getCookRecipe() != null)
			list.add(ramen);
		else 
			selectMenu(userNum);
	}
	

	public void setFoodCount() {
		int foodCount = foodCount();		
		for(int i = 0; i < foodCount; i++) 
			selectMenu(i+1);
	}
	
	public void showSelectedRamen() {
		for(Ramen3 ramen : list) 
			ramen.ramenCook();
	}
	
	
	public Boolean getIsContinue() {
		
		System.out.println("결제 하시겠습니까  ?? ");
		System.out.print("!. 예 (Y) / 되돌아가기  (N) >> ");
		String str = inputStr();
		
		if(str.equalsIgnoreCase("Y")) {
			showOrderedRecipt();
			System.out.println("[프로그램이 종료됩니다~]");
			System.out.println();
			return false;
		}
		
		else if(str.equalsIgnoreCase("N")) {
			System.out.println();
			return true;
		}
		
		else {
			System.out.println("[잘못 입력]");
			return getIsContinue();
		}
	}
	
	public void showOrderedRecipt() {
		System.out.println("=========주문 내역=========");
		
	}
	
	
	public ArrayList<Ramen3> getOrderdList() {
		return this.list;
	}
}
