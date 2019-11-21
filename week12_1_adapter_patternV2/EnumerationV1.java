package week12_1_adapter_patternV2;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Enumeration
 * hasMoreElement()
 * nextElement()
 * 
 * remove()�� ���� ���� ����.
 */
public class EnumerationV1 {

	private static String[] name = {"������", "�ڼ���", "�ڼ���", "������", "������", "������"};
	
	public static void printEnumeration(Enumeration<String> e) {
		while(e.hasMoreElements()) 
			System.out.println("" + e.nextElement());
	}
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		for(int i = 0; i < name.length; i++) {
			v.add(name[i]);
		}
		
		Enumeration<String> e = v.elements();
		EnumerationV1.printEnumeration(e);
	}
}
