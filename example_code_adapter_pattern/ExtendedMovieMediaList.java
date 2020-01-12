package example_code_adapter_pattern;

/*
 * ���� �ڵ��� MovieMediaList����
 * �� ��Ҹ� ����ϴ� �Լ��� ����.
 * ���� ���⼭ �߰������� 
 * �� ��Ҹ� ��� �ϴ� �޼ҵ带 �����. ���ེ���Ե� 
 * list�� private�� �ƴϴ�.
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
