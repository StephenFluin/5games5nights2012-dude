package com.mortalpowers.dude.game;

import java.util.Vector;

import net.phys2d.math.Vector2f;
import net.phys2d.raw.CollisionEvent;
import net.phys2d.raw.CollisionListener;
import net.phys2d.raw.World;

import com.badlogic.gdx.Gdx;

public class Map implements CollisionListener {
	private Vector<Obstacle> elements;
	private Player player = null;
	
	World world;

	public Map() {
		world = new World(new Vector2f(0f, 0f), 10);
		world.addListener(this);
		
		elements = new Vector<Obstacle>();
		
		// Add our first block
		Obstacle b = new Obstacle(5, 0, 2, 3);
		addGameElement(b);
		//addGameElement(new Obstacle(4, 0, 1, 1));
		
		for (Obstacle o : elements) {
			world.add(o.getBody());
		}
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
	
	public void setPlayer(Player p) {
		player = p;
		world.add(player.getBody());
	}

	private void addGameElement(Obstacle b) {
		elements.add(b);
		b.r.setColor(255, 0, 0, 255);
	}
	
	public void render() {
		float step = Gdx.graphics.getDeltaTime();
		if (step > 60) {
			step = 60;
		}
		world.step(step / 36.0f);
		for(Obstacle b : elements) {
			b.render();
		}
	}

	@Override
	public void collisionOccured(CollisionEvent arg0) {
		// TODO Auto-generated method stub
	}

}
