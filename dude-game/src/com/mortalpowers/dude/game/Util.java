package com.mortalpowers.dude.game;

public class Util {
	static int xBlocks = 12;
	static int yBlocks = 10;
	
	
	public static float convertXFromGLToBlocks(float x) {
		return x-xBlocks/2;
	}
	public static float convertYFromGLToBlocks(float y) {
		return y-yBlocks/2;
	}
}
