package com.mortalpowers.dude.game;

import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Renderable {
	float x = 0;
	float y = 0;
	Mesh mesh;

	public Renderable() {}
	
	public Renderable(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public void render() {
		mesh.render(GL10.GL_TRIANGLES, 0, 3);
	}

	public void update() {

	}

}
