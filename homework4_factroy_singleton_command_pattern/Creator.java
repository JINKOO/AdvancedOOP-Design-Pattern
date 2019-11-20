package homework4_factroy_singleton_command_pattern;

/*
 * Creator Class
 * �߻� �޼ҵ��� createWindow()�� ������. 
 */
public abstract class Creator {

	public Creator() {
		
	}
	
	public WindowProduct orderWindow(String title, int x, int y, int width, int height) {
		WindowProduct product = null;
		product = createUserWindow(title, x, y, width, height);
		return product;
	}
	
	/*
	 * 
	 * createUserWindow()������ 
	 * ������ ���� �߻�ȭ �Ͽ�,
	 * Client���� �𸣵��� �Ѵ�. 
	 * �� Client������ Factory Method���� 
	 * ������ � instance�� ����� ������ ���� �ȴ�.
	 * 
	 */
	public abstract WindowProduct createUserWindow(String title, int x, int y, int width, int height);
}
