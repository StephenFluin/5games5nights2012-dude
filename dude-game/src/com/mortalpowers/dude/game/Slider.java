package com.mortalpowers.dude.game;

public class Slider {
	private Rectangle bg;
	private Rectangle slide;
	private float val;
	
	public Slider() {
		val = 0;
		slide = new Rectangle(0, 0.5f, 1, 0.25f);
		bg = new Rectangle(0.25f, 0, 0.5f, 10);
	}
	
	public void render() {
		slide.render();
		bg.render();
	}
	
	public float getVal() {
		return val;
	}
	
	public void setVal(float v) {
		if (v > 1) v = 1;
		if (v < 0) v = 0;
		slide.setLocation(0, val * (10f-0.25f));
		this.val = v;
	}
}
