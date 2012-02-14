package com.mortalpowers.dude.game;

public class Obstacle {
	Rectangle r;
	public Obstacle(float xBlock, float yBlock, float width, float height) {
		r = new Rectangle(xBlock, yBlock, width, height);
	}
	
	public void render() {
		r.render();
	}
	
	public BoundingBox getBoundingBox() {
		return new BoundingBox(getX(), getY(), r.getWidth(), r.getHeight());
	}
	
	public float getX() {
		return Util.convertXFromGLToBlocks(r.x);
	}
	
	public float getY() {
		return Util.convertYFromGLToBlocks(r.y);
	}
}
