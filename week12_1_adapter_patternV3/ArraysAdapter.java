package week12_1_adapter_patternV3;

import java.util.Arrays;
import java.util.List;

/*
 * �ڹٿ���
 * �迭�� ����ũ���� List�� ��ȯ
 * Arrays.asList()�� ����Ѵ�.
 */
public class ArraysAdapter {
	
	public static void printCities(String[] cities, List<String> citylist) {
		
		for(String s : cities)
			System.out.println(s);
		
		for(String s : citylist) 
			System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		String[] cities = {"Seoul", "Incheon", "Busan", "Sejong"};
		
		//���Ⱑ ���� �迭�� ���� List�� ��ȯ�ϴ� �����̴�.
		List<String> list = Arrays.asList(cities);
		
		System.out.println(cities.length);
		System.out.println(list.size());
		
		printCities(cities, list);
		//ù��° ������ �� ����(�ΰ� ��� ��������� ����Ǵ��� Ȯ��)
		list.set(0, "HapJeong");
		printCities(cities, list);
		//cities, list�� �� 0��° ��Ұ� �����Ǿ���. �̰��� �ǹ��ϴ� �ٴ� ���ο� �迭�� ������ ���� �ƴ϶�
		//���� �迭�� wrapp�Ǿ� ��ȯ �Ȱ��̱� �����̴�. 
	}
}
