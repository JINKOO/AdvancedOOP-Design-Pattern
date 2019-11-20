package week10_2_command_pattern;

/*
 * 전등을 켜기 위한 command class의 구현.
 * Concrete Command에 해당한다.
 */
public class LightOnCommand implements Command {
	
	private Light light;
	
	public LightOnCommand(Light light) {  //생성자로 넘어온 light변수는 특정 light를 가리킨다. 
		// TODO Auto-generated constructor stub
		this.light = light;
	}
	
	@Override
	public void execute() {   //특정 receiver에 대한 실행.
		light.on();
	}
}
