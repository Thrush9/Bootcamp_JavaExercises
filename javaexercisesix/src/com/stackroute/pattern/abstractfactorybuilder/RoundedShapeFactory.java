package com.stackroute.pattern.abstractfactorybuilder;

public class RoundedShapeFactory extends AbstractFactoryBuilder{

	@Override
	Shape getShape(String type) {
		if(type.equals("RoundedSquare")) {
			return new RoundedSquare();
		}else if(type.equals("RoundedRectangle")) {
			return new RoundedRectangle();
		}else
		return null;
	}

}
