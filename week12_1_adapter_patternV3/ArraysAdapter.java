package week12_1_adapter_patternV3;

import java.util.Arrays;
import java.util.List;

/*
 * 자바에서
 * 배열을 고정크기의 List로 변환
 * Arrays.asList()를 사용한다.
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
		
		//여기가 고정 배열을 고정 List로 변환하는 과정이다.
		List<String> list = Arrays.asList(cities);
		
		System.out.println(cities.length);
		System.out.println(list.size());
		
		printCities(cities, list);
		//첫번째 원소의 값 변경(두개 모두 변경사항이 적용되는지 확인)
		list.set(0, "HapJeong");
		printCities(cities, list);
		//cities, list의 각 0번째 요소가 수정되었다. 이것이 의미하는 바는 새로운 배열이 생성된 것이 아니라
		//원본 배열이 wrapp되어 변환 된것이기 때문이다. 
	}
}
