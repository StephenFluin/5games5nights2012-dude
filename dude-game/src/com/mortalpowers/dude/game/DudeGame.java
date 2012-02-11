package com.mortalpowers.dude.game;

import com.badlogic.gdx.graphics.OrthographicCamera;

public class DudeGame implements com.badlogic.gdx.ApplicationListener {

	private OrthographicCamera camera;
	private Rectangle r = null;
	

	@Override
	public void create() {
		Slider s = new Slider();
		Rectangle r = new Rectangle(-1, -1, 50, 50);
	}

	public void toggleSpin() {
		
	}

	public void acceptInput() {
		
	}

	@Override
	public void render() {
		acceptInput();
		if (r == null) {
			r = new Rectangle(-1, -1, 1, 1);
		}
		r.render();
	}

	@Override
	public void resize(int width, int height) {
		float aspectRatio = (float) width / (float) height;
		camera = new OrthographicCamera(2f * aspectRatio, 2f);

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

}
