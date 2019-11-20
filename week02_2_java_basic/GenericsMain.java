package week02_2_java_basic;
import java.util.*;

class MyArrayList<E> {
	
	ArrayList<E> list;
	
	public MyArrayList() {
		list = new ArrayList<>();
	}
	
	public void add(E e) {
		list.add(e);
	}
	
	public E get(int i) {
		return (E)list.get(i);
	}
}

public class GenericsMain {

	public static void main(String[] args) {
		
		MyArrayList<String> list = new MyArrayList<>();
		list.add("고진권");
		list.add("박성준");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
	}
}
