package week10_2_command_pattern;

/*
 * ������ �ѱ� ���� command class�� ����.
 * Concrete Command�� �ش��Ѵ�.
 */
public class LightOnCommand implements Command {
	
	private Light light;
	
	public LightOnCommand(Light light) {  //�����ڷ� �Ѿ�� light������ Ư�� light�� ����Ų��. 
		// TODO Auto-generated constructor stub
		this.light = light;
	}
	
	@Override
	public void execute() {   //Ư�� receiver�� ���� ����.
		light.on();
	}
}
