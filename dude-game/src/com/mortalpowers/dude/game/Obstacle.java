package com.mortalpowers.dude.game;

import net.phys2d.raw.Body;
import net.phys2d.raw.StaticBody;
import net.phys2d.raw.shapes.Box;

public class Obstacle {
	Rectangle r;
	private Body body;
	
	public Obstacle(float xBlock, float yBlock, float width, float height) {
		r = new Rectangle(xBlock, yBlock, width, height);
		
        body = new Body(new Box(width, height), 0.01f);
        body.setPosition(xBlock, yBlock);
        body.setDamping(0);
        body.setRotDamping(100);
        body.setRestitution(1f);
        body.setUserData(this);
        body.setMaxVelocity(1, 1);
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
	
	public Body getBody() {
		return body;
	}
}
