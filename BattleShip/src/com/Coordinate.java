package com;

public class Coordinate {

	int x;
	int y;
	boolean status;

	public Coordinate(int x, int y, boolean status) {
		this.x = x;
		this.y = y;
		this.status = status;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
