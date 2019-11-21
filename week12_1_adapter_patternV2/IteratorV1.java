package week12_1_adapter_patternV2;

import java.util.Iterator;
import java.util.Vector;

/*
 * Iterator interface
 * hasNext()
 * next()
 * remove()
 */
public class IteratorV1 {
	
	private static String[] name = {"고진권", "박성준", "박세훈", "정구일", "김형택", "박지상"};
	
	public static void printIterator(Iterator<String> it) {
		while(it.hasNext()) 
			System.out.println("" + it.next());
	}
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		for(int i = 0; i<name.length; i++) {
			v.add(name[i]);
		}
		
		Iterator<String> it = v.iterator();
		it.next();
		it.remove();
		IteratorV1.printIterator(it);
	}
}
