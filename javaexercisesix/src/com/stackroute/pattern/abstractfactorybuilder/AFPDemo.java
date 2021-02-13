package com.stackroute.pattern.abstractfactorybuilder;

class FactoryProducer{
	
	public static AbstractFactoryBuilder getFactory(String type)
	{
		if(type.equals("Shape"))
			return new ShapeFactory();
		else if (type.equals("Rounded"))
			return new RoundedShapeFactory();
		else
			return null;
	}

}

public class AFPDemo {

	public static void main(String[] args) {
		
		AbstractFactoryBuilder factory = FactoryProducer.getFactory("Shape");
		 Shape desiredShape = factory.getShape("Square");
		 desiredShape.drawShape();
	}

}
