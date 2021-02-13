package com.stackroute.pattern.abstractfactorybuilder;

public class RoundedRectangle implements Shape{
	
	private int length;
	private int breadth;
	
	public RoundedRectangle(){
		
	}

	public RoundedRectangle(int l,int b) {
		this.length = l;
		this.breadth = b;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public void drawShape() {
		 System.out.println("Drawn Rounded Rectangle Shape");
	}
	

}
