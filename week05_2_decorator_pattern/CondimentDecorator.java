package week05_2_decorator_pattern;

/*
 * Beverage�� ��ӹ޴�
 * Decorator class
 * getDescription�� abstract�� �Ͽ�
 * ������ ConcreteDecorator���� Override�� �� �ֵ��� �Ѵ�.
 * �̴�,
 * ConcreateComponent������ ���� Beverage�� ��ӹ����Ƿ� 
 * description:String�� ���� ������ �� �ִ�.
 * 
 * ������ ConcreteDecorator������ ���� class�ȿ�
 * Component��������� �ֱ⶧����
 * Wrap�� �Ϸ��� �ݵ�� override�� �ؾ��ϱ� �����̴�. 
 */
public abstract class CondimentDecorator extends Beverage{

	public abstract String getDescription();
		
}
