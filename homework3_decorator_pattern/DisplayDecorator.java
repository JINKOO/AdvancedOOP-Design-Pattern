package homework3_decorator_pattern;

import javax.swing.*;

public abstract class DisplayDecorator extends Display {
	
	//¼öÁ¤
    DisplayDecorator(Display display, int width, int height) {
        super(width, height);
    }
}

