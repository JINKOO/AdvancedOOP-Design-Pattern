package week03_2_strategy_pattern;

import java.util.ArrayList;

/*
 * Ramen Version1���� ����� ����Ѵ�.
 * 
 */

abstract class Ramen2 {
		
	public abstract void cook(); 
}

class GeneralRamen extends Ramen2 {
	@Override
	public void cook() {
		System.out.println("�Ϲ� ������");
	}
}

class RamenWithBroth extends Ramen2 {
	@Override
	public void cook() {
		System.out.println("���� ���");
	}
}

class RamenWithVinegar extends Ramen2 {
	@Override
	public void cook() {
		System.out.println("���� ���");
	}
}

class RamenWithCheese extends Ramen2 {
	@Override
	public void cook() {
		System.out.println("���� ���");
	}
}

class RamenWithMilk extends Ramen2 {
	@Override
	public void cook() {
		System.out.println("���� ���");
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
