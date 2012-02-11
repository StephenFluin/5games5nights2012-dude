package com.mortalpowers.dude.game;

public class Block {
	Rectangle r;
	public Block(float xBlock, float yBlock) {
		r = new Rectangle(xBlock,yBlock,2,3);
		
	}
	
	public void render() {
		r.render();
	}
}
