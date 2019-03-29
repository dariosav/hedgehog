package com.dariosavarese;

public class TreeZone {
	private int apples;
	private int applesIfGoRight = -1;
	private int applesIfGoDown = -1;
	
	public TreeZone(int apples) {
		this.apples = apples;
	}
	public int getApples() {
		return apples;
	}
	public void setApples(int apples) {
		this.apples = apples;
	}
	public int getApplesIfGoRight() {
		return applesIfGoRight;
	}
	public void setApplesIfGoRight(int applesIfGoRight) {
		this.applesIfGoRight = applesIfGoRight;
	}
	public int getApplesIfGoDown() {
		return applesIfGoDown;
	}
	public void setApplesIfGoDown(int applesIfGoDown) {
		this.applesIfGoDown = applesIfGoDown;
	}
	
}
