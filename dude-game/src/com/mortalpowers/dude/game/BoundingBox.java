package com.mortalpowers.dude.game;

public class BoundingBox {
	private float x1;
	private float y1;
	private float x2;
	private float y2;
	
	public enum CollisionType {
		HORIZONTAL,
		VERTICAL,
		NONE
	}
	
	public BoundingBox(float x, float y, float width, float height) {
		this.x1 = x;
		this.y1 = y;
		this.x2 = x + width;
		this.y2 = y + height;
	}
	
	public CollisionType checkCollision(BoundingBox other) {
		System.out.println("Checking for collisions between " + this + " and " + other);
		boolean topLeftCollision = false;
		boolean topRightCollision = false;
		boolean bottomLeftCollision = false;
		boolean bottomRightCollision = false;
		if (this.x1 >= other.x1 && this.x1 <= other.x2 && this.y1 >= other.y1 && this.y1 <= other.y2) {
			topLeftCollision = true;
		}
		if (this.x2 >= other.x1 && this.x2 <= other.x2 && this.y1 >= other.y1 && this.y1 <= other.y2) {
			topRightCollision = true;
		}
		if (this.x1 >= other.x1 && this.x1 <= other.x2 && this.y2 >= other.y1 && this.y2 <= other.y2) {
			bottomLeftCollision = true;
		}
		if (this.x2 >= other.x1 && this.x2 <= other.x2 && this.y2 >= other.y1 && this.y2 <= other.y2) {
			bottomRightCollision = true;
		}
		int collisionCount = 0;
		if (topLeftCollision) { collisionCount++; }
		if (topRightCollision) { collisionCount++; }
		if (bottomLeftCollision) { collisionCount++; }
		if (bottomRightCollision) { collisionCount++; }
		System.out.println("corners in collision: " + collisionCount);
		if (collisionCount == 1) {
			if (bottomRightCollision) {
				if (this.x2 - other.x1 > this.y2 - other.y1) {
					System.out.println("Vertical Collision");
					return CollisionType.VERTICAL;
				} else {
					System.out.println("Horizontal Collision");
					return CollisionType.HORIZONTAL;
				}
			}
		}
		return CollisionType.NONE;
	}
	
	public String toString() {
		return "Bounding Box: x1="+x1+", x2="+x2+", y1="+y1+", y2="+y2;
	}
}
