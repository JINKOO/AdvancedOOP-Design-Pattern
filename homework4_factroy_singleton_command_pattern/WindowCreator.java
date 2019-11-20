package homework4_factroy_singleton_command_pattern;

/*
 * Factory Method Pattern이 있는
 * class이다. 
 */
public class WindowCreator extends Creator {

	private volatile static WindowCreator uniqueInstance;
	
	/*
	 * Singleton Pattern 적용
	 */
	private WindowCreator() {
		
	}
	
	public static WindowCreator getInstance() {
		if(uniqueInstance == null) {
			synchronized (WindowCreator.class) {
				if(uniqueInstance == null)
					uniqueInstance = new WindowCreator();
			}
		}
		return uniqueInstance;
	}
	
	@Override
	public WindowProduct createUserWindow(String title, int x, int y, int width, int height) {
		WindowProduct product = null;
		
		if(title.equals("TextField Window"))
			product = new TextFieldWindow(title, x, y, width, height);
		else if(title.equals("Label Window"))
			product = new LabelWindow(title, x, y, width, height);
		
		return product;
	}
}
