package example_code_adapter_pattern;

import java.util.Collections;

public class Main {
	
    public static void main(String[] args) {
//        MovieMediaList list = new MovieMediaList();
//        list.load("MovieMedia.data");
//        list.printAll();
        String s = "���� ���� ��";
//        MovieMediaManager mmm = new MovieMediaManagerFile("MovieMedia.data");

        MovieMediaManager mmm = new MovieMediaListAdapter("MovieMedia.data");
        
        mmm.printAll();
        System.out.println("Printing 0th item");
        mmm.print(0);
        System.out.printf("Searching: %s\n", s);
        int idx = mmm.find(s);
        if (idx >= 0) {
            System.out.printf("Found at index %d\n", idx);
            mmm.print(idx);
        }
        else {
            System.out.printf("%s is not found\n", s);
        }
    }
}
