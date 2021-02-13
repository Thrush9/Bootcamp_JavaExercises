package com.stackroute.pattern.abstractfactorybuilder;

public class Square implements Shape{
	
	private int side;
	
	public Square() {
		
	}

	public Square(int s) {
		this.side = s;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public void drawShape() {
	   System.out.println("Drawn Square Shape");	
	}
	
	
}
