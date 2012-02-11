package com.mortalpowers.dude.game;

import com.badlogic.gdx.backends.jogl.JoglApplication;

public class DesktopStarter {
public static void main(String[] args) {
	new JoglApplication(new DudeGame(), "Dude",800,480,false);
}
}
