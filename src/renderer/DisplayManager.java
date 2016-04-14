package renderer;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.ContextAttribs;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.PixelFormat;

public class DisplayManager {
	
	static final int WIDTH = 1920;
	static final int HEIGHT = 1080;
	static final int FPS = 60;
	static float RED = 0.0f;
	static float GREEN = 0.0f;
	static float BLUE = 0.0f;
	static Renderer renderer = new Renderer();
	
	public static void createDisplay(){
		ContextAttribs attribs = new ContextAttribs(3,2).withForwardCompatible(true).withProfileCore(true);
		
		try {
			Display.setDisplayMode(new DisplayMode(WIDTH, HEIGHT));
			Display.create(new PixelFormat(), attribs);
			Display.setTitle("Java2DGameEngine");
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		GL11.glViewport(0, 0, WIDTH, HEIGHT);
		
		
	}
	
	public static void updateDisplay(){
		
		Display.sync(FPS);
		renderer.render(RED, GREEN, BLUE);
		Display.update();
	}
	
	public static void closeDisplay(){
		Display.destroy();
	}
	
	public static void setBgColor(float r, float g, float b){
		RED = r;
		GREEN = g;
		BLUE = b;
	}

	
}
