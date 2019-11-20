package homework1_starategy_pattern;

public class CompareFileName implements Comparable {

	@Override
	public boolean myCompareTo(Object obj1, Object obj2) {
		
		FileInfo file1 = (FileInfo)obj1;
		FileInfo file2 = (FileInfo)obj2;
		
		if(file1.getName().compareTo(file2.getName()) > 0)
			return true;
		else
			return false;
		}
}
