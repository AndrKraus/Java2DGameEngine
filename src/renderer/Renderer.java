package renderer;

import org.lwjgl.opengl.GL11;

public class Renderer {
	
	public Renderer(){
		
		
		
	}
	
	public void render(float r, float g, float b){
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT|GL11.GL_DEPTH_BUFFER_BIT);
		GL11.glClearColor(r, g, b, 1.0f);
	}

}
