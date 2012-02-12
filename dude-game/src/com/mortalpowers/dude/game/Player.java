package com.mortalpowers.dude.game;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.g3d.loaders.obj.ObjLoader;

public class Player {
	
	Mesh model;
	public Player() {
		InputStream stream=null;
        try {
            stream = new FileInputStream(Gdx.files.internal("data/sphere.obj").path());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        model = ObjLoader.loadObj(stream, true);
        Gdx.gl10.glTranslatef(0.0f,0.0f,-3.0f);
	}
	
	public void render() {
		model.render(GL10.GL_TRIANGLES);
	}
}
