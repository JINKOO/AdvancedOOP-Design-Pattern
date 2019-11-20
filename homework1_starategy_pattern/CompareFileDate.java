package homework1_starategy_pattern;

public class CompareFileDate implements Comparable {
	
	@Override
	public boolean myCompareTo(Object obj1, Object obj2) {
		
		FileInfo file1 = (FileInfo)obj1;
		FileInfo file2 = (FileInfo)obj2;
		
		if(file1.getModifiedDate().compareTo(file2.getModifiedDate()) > 0)
			return true;
		else
			return false;
	}
}
