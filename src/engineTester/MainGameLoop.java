package engineTester;

import org.lwjgl.opengl.Display;

import renderer.DisplayManager;

public class MainGameLoop {
	
	

	public static void main(String[] args) {
		DisplayManager.createDisplay();
		int x = 0;
		float c = 0.0f;
		while(!Display.isCloseRequested()){
			x++;
			System.out.println("Frame: " + x);
			DisplayManager.setBgColor(c%1.0f, (c + 0.5f)%1.0f , (c + 1.3f)%1.0f);
			DisplayManager.updateDisplay();
			c += 0.01f;
		}

	}

}
