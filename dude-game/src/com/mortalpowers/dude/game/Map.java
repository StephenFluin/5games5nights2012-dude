package com.mortalpowers.dude.game;

import java.util.Vector;

import com.badlogic.gdx.graphics.Color;

public class Map {


	private Vector<Obstacle> elements;
	
	public Map() {
		
		elements = new Vector<Obstacle>();
		
		// Add our first block
		Obstacle b = new Obstacle(5,0);
		addGameElement(b,4,0);
		
		
	}

	private void addGameElement(Obstacle b, int xBlock, int yBlock) {
		elements.add(b);
		b.r.setColor(255, 0, 0, 255);
		
	}
	public void render() {
		for(Obstacle b : elements) {
			b.render();
		}
	}

}
