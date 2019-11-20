package homework1_starategy_pattern;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	String[] names = {"CompareModifiedDate", "CompareFileType", "CompareFileName", "Main", "CompareSize"};
	String[] types = { "java", "java", "class", "java", "Class" };
    int[] sizes = { 120, 80, 150, 85, 100 };
    String[] dateStrings = { "2019-09-13T21:59:00", "2019-09-12T21:59:00",
                             "2019-09-13T16:54:00", "2019-09-12T21:54:00", "2019-09-13T11:59:00" };
	
    
    public FileInfo[] createFileInfoArrays() {
    	FileInfo[] fileLists = new FileInfo[names.length];
    	SimpleDateFormat dateTimeInstance = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    	
    	for(int i = 0; i<fileLists.length; i++) {
    		Date date = dateTimeInstance.parse(dateStrings[i], new ParsePosition(0));
    		fileLists[i] = new FileInfo(names[i], types[i], sizes[i], date);
    	}
    	
    	return fileLists;
    }
    
    
    public void printFileLists(FileInfo[] fileLists) {
    	for(FileInfo fileInfo : fileLists) {
    		System.out.println(fileInfo);
    	}
    	System.out.println();
    }
    
    
	public static void main(String[] args) {
		
		Main m = new Main();
        FileInfo[] fileLists = m.createFileInfoArrays();
        System.out.println("[[���� ����Ʈ]]");
        m.printFileLists(fileLists);
       
        
        //������ �ڵ� �߰�.
        Sorter sort = new Sorter();
        FileInfo[] result;
        
        System.out.println("[[�����̸����� ���ĵ� ����Ʈ]]");
        sort.setComparable(new CompareFileName());
        result = sort.bubbleSort(fileLists);
        m.printFileLists(result);
        
        System.out.println("[[���� ������ ���ĵ� ����Ʈ]]");
        sort.setComparable(new CompareFileType());
        result = sort.bubbleSort(fileLists);
        m.printFileLists(result);
        
        System.out.println("[[���� ũ��� ���ĵ� ����Ʈ]]");
        sort.setComparable(new CompareFileSize());
        result = sort.bubbleSort(fileLists);
        m.printFileLists(result);
        
        System.out.println("[[���� �����ð����� ���ĵ� ����Ʈ]]");
        sort.setComparable(new CompareFileDate());
        result = sort.bubbleSort(fileLists);
        m.printFileLists(result);
	}
}
