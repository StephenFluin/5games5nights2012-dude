package com.mortalpowers.dude.game;

public class Obstacle {
	Rectangle r;
	public Obstacle(float xBlock, float yBlock) {
		r = new Rectangle(xBlock,yBlock,2,3);
		
	}
	
	public void render() {
		r.render();
	}
}
