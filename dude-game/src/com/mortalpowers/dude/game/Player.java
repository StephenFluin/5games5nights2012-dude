package com.mortalpowers.dude.game;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.g3d.loaders.obj.ObjLoader;

public class Player {
	float glX;
	float glY;
	Mesh model;
	public Player() {
		InputStream stream=null;
        try {
            stream = new FileInputStream(Gdx.files.internal("data/sphere.obj").path());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        setPosition(2,0);
        model = ObjLoader.loadObj(stream, true);
       // glX = -200;
        //glY = -400;
        
        System.out.println("glX is " + glX + " and Y is " + glY);
	}
	
	public void render() {
		Gdx.gl10.glTranslatef(glX,glY,-3.0f);
		model.render(GL10.GL_TRIANGLES);
	}
	public void setPosition(float x,float y) {
		x = Util.convertXFromBlocksToGL(x);
		y = Util.convertYFromBlocksToGL(y);
		glX = x;
		glY = y;
	}
}
