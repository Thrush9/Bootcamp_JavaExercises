package com.stackroute.pattern.abstractfactorybuilder;

public class ShapeFactory extends AbstractFactoryBuilder{

	@Override
	 Shape getShape(String type) {
		if(type.equals("Square")) {
			return new Square();
		}else if(type.equals("Rectangle")) {
			return new Rectangle();
		}else
		return null;
	}

}
