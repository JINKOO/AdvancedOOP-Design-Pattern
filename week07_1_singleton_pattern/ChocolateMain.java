package week07_1_singleton_pattern;

class Thread1 implements Runnable {
	
	@Override
	public void run() {
		
		try {
			System.out.println("Tread1 run");
			Thread.sleep(1000);
			ChocolateBoiler c = ChocolateBoiler.getInstance();
			c.fill();
			c.boil();
			c.drain();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class Thread2 implements Runnable {
	
	@Override
	public void run() {
		try {
			System.out.println("Tread2 run");
			ChocolateBoiler c = ChocolateBoiler.getInstance();
			c.fill();
			c.boil();
			c.drain();
			Thread.sleep(1000);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class ChocolateMain {

	public static void main(String[] args) {
		
//		ChocolateBoiler choco = new ChocolateBoiler();
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.run();
		t2.run();
		
		System.out.println(ChocolateBoiler.getCount());
		
//		ChocolateBoiler choco = ChocolateBoiler.getInstance();
//		System.out.println(choco.isBoiled() + ", " + choco.isEmpty());
//		choco.fill();
//		System.out.println(choco.isBoiled() + ", " + choco.isEmpty());
//		choco.boil();
//		System.out.println(choco.isBoiled() + ", " + choco.isEmpty());
//		choco.drain();
//		System.out.println(choco.isBoiled() + ", " + choco.isEmpty());
	}
}
