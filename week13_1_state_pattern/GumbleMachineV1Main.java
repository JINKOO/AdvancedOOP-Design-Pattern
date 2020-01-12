package week13_1_state_pattern;

public class GumbleMachineV1Main {

	public static void main(String[] args) {
		
		GumbleMachineV1 machineV1 = new GumbleMachineV1(5);
		System.out.println(machineV1);
		
		machineV1.insertQuarter();
		machineV1.trunkCrank();
		
		System.out.println(machineV1);
		
		machineV1.insertQuarter();
		machineV1.trunkCrank();
		machineV1.insertQuarter();
		machineV1.trunkCrank();
		machineV1.ejectQuarter();
		
		System.out.println(machineV1);
	
		machineV1.insertQuarter();
		machineV1.insertQuarter();
		machineV1.trunkCrank();
		machineV1.insertQuarter();
		machineV1.trunkCrank();
		
		System.out.println("���� �κ�");
		
		machineV1.insertQuarter();
		machineV1.trunkCrank();
		
		System.out.println(machineV1);
	}
}
