package homework1_starategy_pattern;

public class Sorter {
	
	private Comparable compare;
	
	public void setComparable(Comparable compare) {
		this.compare = compare;
	}
	
	public FileInfo[] bubbleSort(Object[] objs) {
		
		for(int i = 0; i < objs.length - 1; i++) {		
			for(int j = 0; j<objs.length - 1; j++) {
				if (compare.myCompareTo(objs[j], objs[j+1])) { // swap
                    Object temp = objs[j];
                    objs[j] = objs[j + 1];
                    objs[j + 1] = temp;
                }
			}
		}
		return (FileInfo[])objs;
    }
}