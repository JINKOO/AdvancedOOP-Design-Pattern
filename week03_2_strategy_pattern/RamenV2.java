package week03_2_strategy_pattern;

import java.util.ArrayList;

/*
 * Ramen Version1에서 상속을 사용한다.
 * 
 */

abstract class Ramen2 {
		
	public abstract void cook(); 
}

class GeneralRamen extends Ramen2 {
	@Override
	public void cook() {
		System.out.println("일반 조리법");
	}
}

class RamenWithBroth extends Ramen2 {
	@Override
	public void cook() {
		System.out.println("뽁음 라면");
	}
}

class RamenWithVinegar extends Ramen2 {
	@Override
	public void cook() {
		System.out.println("식초 라면");
	}
}

class RamenWithCheese extends Ramen2 {
	@Override
	public void cook() {
		System.out.println("취즈 라면");
	}
}

class RamenWithMilk extends Ramen2 {
	@Override
	public void cook() {
		System.out.println("우유 라면");
	}
}

//class ChickenRamen extends Ramen2 implments() {
//	
//}

public class RamenV2 {
	
	public static void main(String[] args) {
		
		ArrayList<Ramen2> list = new ArrayList<>();
		list.add(new GeneralRamen());
		list.add(new RamenWithBroth());
		list.add(new RamenWithCheese());
		list.add(new RamenWithMilk());
		list.add(new RamenWithVinegar());
		
		for(Ramen2 ramen: list) {
			ramen.cook();
		}
	}
}
