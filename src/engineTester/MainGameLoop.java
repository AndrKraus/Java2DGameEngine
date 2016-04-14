package engineTester;

import org.lwjgl.opengl.Display;

import renderer.DisplayManager;

public class MainGameLoop {
	
	

	public static void main(String[] args) {
		DisplayManager.createDisplay();
		int x = 0;
		while(!Display.isCloseRequested()){
			x++;
			System.out.println("Frame: " + x);
			DisplayManager.updateDisplay();
		}

	}

}
