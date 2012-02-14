package com.mortalpowers.dude.game;

import com.badlogic.gdx.Gdx;

public class Slider {
	private Rectangle bg;
	private Rectangle slide;
	private float val;
	public float increaseLag;
	
	public Slider() {
		val = 0;
		slide = new Rectangle(0, 0.5f, 1, 0.25f);
		bg = new Rectangle(0.25f, 0, 0.5f, 10);
	}
	
	public void render() {
		slide.render();
		bg.render();
		
		if(increaseLag >0) {
			increaseLag -= .6 * Gdx.graphics.getDeltaTime();
		}
	}
	
	public float getVal() {
		return val;
	}
	
	/**
	 * Update slider position.
	 * @param v New slider value to set the slider to.
	 */
	public void setVal(float v) {
		// Don't let it exceed visible ranges
		if (v > 1) v = 1;
		if (v < 0) v = 0;
		
		if(this.val<v) {
			increaseLag += v-this.val;
		}
		slide.setLocation(0, val * (10f-0.25f));
		this.val = v;
	}
}
