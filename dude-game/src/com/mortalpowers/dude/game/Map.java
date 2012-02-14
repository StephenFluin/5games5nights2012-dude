package com.mortalpowers.dude.game;

import java.util.Vector;

import com.badlogic.gdx.graphics.Color;

public class Map {
	private Vector<Obstacle> elements;
	
	public Map() {
		
		elements = new Vector<Obstacle>();
		
		// Add our first block
		Obstacle b = new Obstacle(5, 0, 2, 3);
		addGameElement(b);
		addGameElement(new Obstacle(4, 0, 1, 1));
	}
	
	public BoundingBox.CollisionType checkForCollisions(Player p) {
		BoundingBox player = p.getBoundingBox();
		for (Obstacle o : elements) {
			BoundingBox obstacle = o.getBoundingBox();
			BoundingBox.CollisionType collision = player.checkCollision(obstacle);
			if (collision != BoundingBox.CollisionType.NONE) {
				return collision;
			}
		}
		return BoundingBox.CollisionType.NONE;
	}

	private void addGameElement(Obstacle b) {
		elements.add(b);
		b.r.setColor(255, 0, 0, 255);
	}
	
	public void render() {
		for(Obstacle b : elements) {
			b.render();
		}
	}

}
