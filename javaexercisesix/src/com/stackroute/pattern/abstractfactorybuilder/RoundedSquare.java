package com.stackroute.pattern.abstractfactorybuilder;

public class RoundedSquare implements Shape{
	
    private int side;
	
	public RoundedSquare() {
		
	}

	public RoundedSquare(int s) {
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
	   System.out.println("Drawn Rounded Square Shape");	
	}

}
