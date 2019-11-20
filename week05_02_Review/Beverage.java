package week05_02_Review;

/*
 * Component가 되는 Abstract Class이다.
 */
public abstract class Beverage {

	
	private String description = "제목 없음";

	
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}
	
	/*
	 * 여기서는 abstract Method로 한다.
	 */
	public abstract double cost();
}
