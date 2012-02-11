package com.mortalpowers.dude.game;

import java.util.Vector;

import com.badlogic.gdx.graphics.Color;

public class Map {


	private Vector<Block> elements;
	
	public Map() {
		
		elements = new Vector<Block>();
		
		// Add our first block
		Block b = new Block(5,0);
		addGameElement(b,4,0);
		
		
	}

	private void addGameElement(Block b, int xBlock, int yBlock) {
		elements.add(b);
		b.r.setColor(255, 0, 0, 255);
		
	}
	public void render() {
		for(Block b : elements) {
			b.render();
		}
	}

}
