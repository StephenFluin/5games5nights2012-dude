package com.mortalpowers.dude.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.VertexAttribute;
import com.badlogic.gdx.graphics.VertexAttributes.Usage;

public class Rectangle {
	private float width;
	private float height;
	private Mesh rectangle;
	private float color;
	private boolean dirty = true;
	float x;
	float y;

	public Rectangle(float x, float y, float width, float height) {
		setLocation(x, y);

		this.width = width;
		this.setHeight(height);
		color = Color.toFloatBits(0, 0, 255, 255);

		rectangle = new Mesh(true, 4, 4, new VertexAttribute(Usage.Position, 3,
				"a_position"), new VertexAttribute(Usage.ColorPacked, 4,
				"a_color"));
		rectangle.setIndices(new short[] { 0, 1, 2, 3 });
	}

	public void render() {
		if (dirty) {
			rectangle.setVertices(new float[] { x, y, 0, color,
					x + width, y, 0, color,
					x, y + getHeight(), 0, color,
					x + width, y + getHeight(), 0, color });
			
			dirty = false;
		}
		rectangle.render(GL10.GL_TRIANGLE_STRIP, 0, 4);
	}

	public void setColor(int r, int g, int b, int a) {
		color = Color.toFloatBits(r, g, b, a);
	}

	/**
	 * Take in a location (like 0,0 at the lower left corner).
	 * 
	 * @param x
	 * @param y
	 */
	public void setLocation(float x, float y) {
		x = Util.convertXFromBlocksToGL(x);
		y = Util.convertYFromBlocksToGL(y);
		this.x = x;
		this.y = y;
		dirty = true;
	}

	public void setSize(float width, float height) {
		this.width = width;
		this.setHeight(height);
		dirty = true;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public float getWidth() {
		return width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
}
