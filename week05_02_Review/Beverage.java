package week05_02_Review;

/*
 * Component�� �Ǵ� Abstract Class�̴�.
 */
public abstract class Beverage {

	
	private String description = "���� ����";

	
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}
	
	/*
	 * ���⼭�� abstract Method�� �Ѵ�.
	 */
	public abstract double cost();
}
