package chapter5.ObjectOrientedDesignPrinciples.AbstractFactoryPattern;

enum ShapeType{
	Circle,Rectangle
}

interface ShapeFactory {
	
	public Shape getShape(ShapeType shapeType);
	
}
