package com.mortalpowers.dude.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.VertexAttribute;
import com.badlogic.gdx.graphics.VertexAttributes.Usage;

public class Rectangle extends Renderable {
	private int width;
	private int height;
	private Mesh rectangle;
	private float color;

	public Rectangle(int xpix, int ypix, int width, int height) {
		super(xpix, ypix);
		this.width = width;
		this.height = height;
		color = Color.toFloatBits(0, 0, 255, 255);

		rectangle = new Mesh(true, 4, 4,
				new VertexAttribute(Usage.Position, 3, "a_position"),
				new VertexAttribute(Usage.ColorPacked, 4, "a_color"));
		rectangle.setVertices(new float[] { x, y, 0, color,
											x+width, y, 0, color,
											x, y+width, 0 ,color,
											x+width, y+width, 0, color
											});
		rectangle.setIndices(new short[] { 0, 1, 2, 3 });
	}
	
	public void render() {
		rectangle.render(GL10.GL_TRIANGLE_STRIP, 0, 4);
	}

	public void setColor(int r, int g, int b, int a) {
		color = Color.toFloatBits(r, g, b, a);
	}
	
	public void setLocation(int xpix, int ypix) {
		this.x = xpix;
		this.y = ypix;
	}
	
	public void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	}
}
