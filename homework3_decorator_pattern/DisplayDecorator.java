package homework3_decorator_pattern;

import javax.swing.*;

public abstract class DisplayDecorator extends Display {
	
	//����
    DisplayDecorator(Display display, int width, int height) {
        super(width, height);
    }
}

