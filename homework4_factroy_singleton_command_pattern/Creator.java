package homework4_factroy_singleton_command_pattern;

/*
 * Creator Class
 * 추상 메소드인 createWindow()를 가진다. 
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
	 * createUserWindow()에서는 
	 * 다음과 같이 추상화 하여,
	 * Client에서 모르도록 한다. 
	 * 즉 Client에서는 Factory Method에서 
	 * 실제로 어떤 instance가 만들어 지는지 몰라도 된다.
	 * 
	 */
	public abstract WindowProduct createUserWindow(String title, int x, int y, int width, int height);
}
