package week12_1_adapter_patternV3;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IteratorV2 {

	public static String[] name = {"고진권", "박성준", "박세훈", "정구일", "김형택", "박지상"};
	
	public static void printIterator(Iterator it) {
		while(it.hasNext())
			System.out.println("" + it.next());
	}
	
	public static void main(String[] args) {
		
		Vector v =  new Vector<>();
		
		for(int i = 0; i < name.length; i++) {
			v.add(name[i]);
		}
		
		Enumeration e = v.elements();
		Iterator it = new EnumerationIterator(e);
		Iterator it2 = v.iterator();
		
		IteratorV2.printIterator(it);
//		IteratorV2.printIterator(it2);
	}
}
