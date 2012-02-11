package com.mortalpowers.dude.game;

import java.util.Vector;

import com.badlogic.gdx.graphics.Color;

public class Map extends Renderable {

	public int blocksize = 50;
	private Vector<Block> elements;
	
	public Map(int xPix, int yPix) {
		super(xPix, yPix);
		
		elements = new Vector<Block>();
		
		// Add our first block
		Block b = new Block(3,2);
		addGameElement(b,4,0);
		
		
	}

	private void addGameElement(Block b, int xBlock, int yBlock) {
		elements.add(b);
		b.x = xBlock * blocksize;
		b.y = yBlock * blocksize;
		b.setColor(Color.toFloatBits(255, 0, 0, 255));
		
	}
	public void render() {
		for(Block b : elements) {
			b.render();
		}
	}

}
