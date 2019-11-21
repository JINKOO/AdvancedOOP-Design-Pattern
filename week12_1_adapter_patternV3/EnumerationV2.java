package week12_1_adapter_patternV3;

import java.util.Enumeration;

public class EnumerationV2 {

	public static void printEnumneration(Enumeration e) {
		while(e.hasMoreElements())
			System.out.println("" + e.nextElement());
	}
}
