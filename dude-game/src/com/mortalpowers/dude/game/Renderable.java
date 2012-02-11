package com.mortalpowers.dude.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Renderable {
	int x = 0;
	int y = 0;
	Texture texture = null;

	public Renderable(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void render(SpriteBatch batch) {
		batch.draw(texture, this.x, this.y);
	}

	public void update() {

	}

}
