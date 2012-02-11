package com.mortalpowers.dude.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class DudeGame implements com.badlogic.gdx.ApplicationListener {

	private OrthographicCamera camera;
	Map gameMap;
	private Rectangle r = null;

	@Override
	public void create() {
		gameMap = new Map(0, 0);
		Slider s = new Slider();
		r = new Rectangle(-1, -1, 1, 1);
	}

	public void acceptInput() {

	}

	@Override
	public void render() {
		 
		acceptInput();
		camera.update();
        camera.apply(Gdx.gl10);
		gameMap.render();

		r.render();
	}

	@Override
	public void resize(int width, int height) {
		camera = new OrthographicCamera(800f, 480f);

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
