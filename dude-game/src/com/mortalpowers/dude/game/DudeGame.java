package com.mortalpowers.dude.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;

public class DudeGame implements com.badlogic.gdx.ApplicationListener {

	private OrthographicCamera camera;
	Map gameMap;
	private Rectangle r = null;
	private Slider s = null;
	private int screenWidth = 1;
	private int screenHeight = 1;

	@Override
	public void create() {
		gameMap = new Map();
		s = new Slider();

		r = new Rectangle(4, 0, 1, 1);
	}

	public void acceptInput() {
		if(Gdx.input.justTouched()) {
			System.out.println(Gdx.input.getX() + "x" + Gdx.input.getY());
			s.setVal(2f + -1 * ((float)Gdx.input.getY()) / ((float)screenHeight));
		}
	}

	@Override
	public void render() {
		acceptInput();
		camera.update();
        camera.apply(Gdx.gl10);
		gameMap.render();

		r.render();
		s.render();
	}

	@Override
	public void resize(int width, int height) {
		camera = new OrthographicCamera(Util.xBlocks, Util.yBlocks);
		// Game has 12 blocks wide, 10 blocks high
		screenWidth = width;
		screenHeight = height;
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
