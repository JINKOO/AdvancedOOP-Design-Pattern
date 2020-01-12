package example_code_adapter_pattern;

/*
 * 기존 코드인 MovieMediaList에는
 * 각 요소를 출력하는 함수가 없다.
 * 따라서 여기서 추가적으로 
 * 각 요소를 출력 하는 메소드를 만든다. 다행스럽게도 
 * list가 private이 아니다.
 */
public class ExtendedMovieMediaList extends MovieMediaList {

	public ExtendedMovieMediaList() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public MovieMedia get(int index) {
		return list.get(index);
	}
	
	public int getSize() {
		return list.size();
	}
}
