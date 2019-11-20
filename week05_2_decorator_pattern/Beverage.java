package week05_2_decorator_pattern;


/*
 *  Component에 해당하는 class이다.
 *  Interface 혹은 Abstract로 구현한다.
 *  
 *  이 Beverage를 상속받는 class는 
 *  Decorator(ConcreateDecorator가 상속받는다.// ConcreteComponent이다.)
 */
public abstract class Beverage {

	String description = "제목 없음";
	
	public Beverage() {
		
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract double cost();
}
