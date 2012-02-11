package com.mortalpowers.dude.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.VertexAttribute;
import com.badlogic.gdx.graphics.VertexAttributes.Usage;

public class Block extends Renderable {
	float color;
	public Mesh mesh;

	public Block(int width, int height) {
		mesh = new Mesh(true, 3, 3, new VertexAttribute(Usage.Position, 3,
				"a_position"), new VertexAttribute(Usage.ColorPacked, 4,
				"a_color"));
		mesh.setVertices(new float[] { -.5f, -.5f, 0,Color.toFloatBits(255, 0, 0, 255), 
				 .5f, -.5f, 0,Color.toFloatBits(0, 255, 0, 255), 
				 0, .5f, 0,Color.toFloatBits(0, 0, 255, 255), 
				});

		mesh.setIndices(new short[] { 0, 1, 2 });
	}

	public void setColor(float color) {
		this.color = color;
	}

	public void render() {
		mesh.render(GL10.GL_TRIANGLES, 0, 3);
	}
}
